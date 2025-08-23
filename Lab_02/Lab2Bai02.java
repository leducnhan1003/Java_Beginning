package Lab2;

import java.util.Scanner;

public class Lab2Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("We have an equation of the form ax^2 + bx = c");
		System.out.print("Enter integer value a: ");
		int a = scanner.nextInt();
		System.out.print("Enter integer value b: ");
		int b = scanner.nextInt();
		System.out.print("Enter integer value c: ");
		int c = scanner.nextInt();
		System.out.printf("The equation is %dx^2 + %dx + %d = 0 \n", a, b, c);
		double x;

		if (a == 0) {
			x = (float) -c / b;
			System.out.println("x = " + x);

		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			System.out.println("Delta = " + delta);
			if (delta < 0) {
				System.out.println("The equation with no solution");
			} else if (delta == 0) {
				x = (float) -b / (2 * a);
				System.out.printf("x = %d \n", x);
			} else {
				System.out.println("The equation has two saparate solutions");
				double x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("x1 = %.3f \n", x1);
				System.out.printf("x2 = %.3f \n", x2);
			}
		}
		scanner.close();
	}
}
