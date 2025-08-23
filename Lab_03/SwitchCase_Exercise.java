package Lab3;

import java.util.Scanner;

public class SwitchCase_Exercise {
	public static void main(String[] args) {

		System.out.println(">> Feature Selection <<");
		System.out.println("++ ----------------- ++");
		System.out.println("|   1. Addition      |");
		System.out.println("|   2. Subtraction   |");
		System.out.println("|   3. Exit          |");
		System.out.println("++ ----------------- ++");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Your choice is ");
		byte choice = scanner.nextByte();

		switch (choice) {
		case 1:
			System.out.println("Your choice is addition");
			break;

		case 2:
			System.out.println("Your choice is subtraction");
			break;

		default:
			System.out.println("Your choice is exit");
			System.exit(0);
		}
		scanner.close();
	}
}
