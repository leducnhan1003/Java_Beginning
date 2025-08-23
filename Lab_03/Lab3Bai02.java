package Lab3;

import java.util.Scanner;

public class Lab3Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a integer number: ");
		int a = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			int results = a * i;
			System.out.printf("%d x %d = %d \n", a, i, results);
		}

		scanner.close();
	}
}
