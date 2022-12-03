import java.io.File;
import java.util.Scanner;

//Problem Statement: https://adventofcode.com/2022/day/3

public class Day3P02 {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\sgupta4\\Downloads\\input.txt");
		Scanner sc = new Scanner(file);
		int sum = 0;
		while (sc.hasNextLine()) {
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			String s3 = sc.nextLine();
			for (int i = 0; i < s1.length(); i++) {
				if (s2.contains(Character.toString(s1.charAt(i))) && s3.contains(Character.toString(s1.charAt(i)))) {
					if (s1.charAt(i) >= 65 && s1.charAt(i) <= 90) {
						sum += s1.charAt(i) - 38;
					} else {
						sum += s1.charAt(i) - 96;
					}
					break;
				}
			}
		}
		System.out.println(sum);
	}
}
