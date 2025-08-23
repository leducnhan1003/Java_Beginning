package Lab1;

import java.util.Scanner;

public class Lab1Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter student's name: ");
		String name = scanner.nextLine();
		System.out.print("Enter the score: ");
		Double score = scanner.nextDouble();

		System.out.println(name + " co diem = " + score);
		scanner.close();

	}
}
