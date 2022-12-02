import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Problem Statement: https://adventofcode.com/2022/day/2

public class Part1 {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\sgupta4\\Downloads\\input.txt");
		Scanner sc = new Scanner(file);
		int sum = 0;
		while (sc.hasNextLine()) {
			String strategy = sc.nextLine();
			String c[] = strategy.split("\\s+");
			int x = c[0].charAt(0) - 'A';
			int y = c[1].charAt(0) - 'X';
			if (x == y)
				sum += 3;
			else if ((y - x == 1) || (x == 2 && y == 0))
				sum += 6;
			sum += y + 1;

		}
		System.out.println(sum);
	}
}
