import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Problem Statement : https://adventofcode.com/2022/day/1
// Part-1: Calculate the sum of numbers that represent calorie counts, and find the largest sum.
// Part-2: Instead of finding the single largest value, calculate the sum of top 3 largest values
public class Day1 {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\sgupta4\\Downloads\\input.txt");
		Scanner sc = new Scanner(file);
		List<Integer> elves = new ArrayList<>();
		int totalCalories = 0;
		while (sc.hasNextLine()) {
			String calorie = null;
			if (!(calorie = sc.nextLine()).isEmpty()) {
				totalCalories += Integer.valueOf(calorie);
			} else {
				elves.add(totalCalories);
				totalCalories = 0;
			}
		}
		Collections.sort(elves, Collections.reverseOrder());
		System.out.print(elves.get(0) + " calories are being carried by the Elf carrying the most Calories");  
		System.out.print("Sum of top 3 calories " + elves.stream().mapToInt(Integer::intValue).limit(3).sum()); 

	}
}
