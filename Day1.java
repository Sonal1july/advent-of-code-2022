import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
			}
		}
		Collections.sort(elves, Collections.reverseOrder());
		System.out.print(elves.get(0) + " calories are being carried by the Elf carrying the most Calories"); // Part-1

		System.out.print("Sum of top 3 calories " + elves.stream().mapToInt(Integer::intValue).limit(3).sum()); // Part-2

	}
}
