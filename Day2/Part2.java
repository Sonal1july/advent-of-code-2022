import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Problem Statement: https://adventofcode.com/2022/day/2

public class Part2 {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\sgupta4\\Downloads\\input.txt");
		Scanner sc = new Scanner(file);
		int sum = 0;
		while (sc.hasNextLine()) {
			String strategy = sc.nextLine();
			String c[] = strategy.split("\\s+");
			int x = c[0].charAt(0) - 'A';
			if (c[1].equals("X"))
				sum += (x == 0) ? 3 : (x - 1) % 3 + 1;
			else if (c[1].equals("Y"))
				sum += 3 + x + 1;
			else
				sum += 6 + (x + 1) % 3 + 1;
		}
		System.out.println(sum);
	}
}
