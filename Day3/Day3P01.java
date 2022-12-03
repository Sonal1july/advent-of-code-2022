import java.io.File;
import java.util.Scanner;

//Problem Statement: https://adventofcode.com/2022/day/3

public class Day3P01 {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\sgupta4\\Downloads\\input.txt");
		Scanner sc = new Scanner(file);
		int sum = 0;
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			int mid = s.length() / 2;
			String[] parts = { s.substring(0, mid), s.substring(mid) };
			for (int i = 0; i < parts[0].length(); i++) {
				if (parts[1].contains(Character.toString(parts[0].charAt(i)))) {
					if (parts[0].charAt(i) >= 65 && parts[0].charAt(i) <= 90) {
						sum += parts[0].charAt(i) - 38;
					} else {
						sum += parts[0].charAt(i) - 96;
					}
					break;
				}
			}
		}
		System.out.println(sum);
	}
}
