package Lab2;

import java.util.Scanner;

public class Lab2Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("We have an equation of the form ax + b = c");
		System.out.print("Enter integer value a: ");
		int a = scanner.nextInt();
		System.out.print("Enter integer value b: ");
		int b = scanner.nextInt();
		System.out.printf("The equation is %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("The equation has infinite solutions.");

		} else if (a == 0 && b != 0) {
			System.out.println("The equation with no solution");
		} else {
			double x = (float) -b / a;
			System.out.printf("x = %.3f \n", x);
		}
		scanner.close();
	}
}
