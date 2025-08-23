package Lab2;

import java.util.Scanner;

public class Lab2Bai04 {
	public static void main(String[] args) {

		System.out.println("          >> Feature Slection <<       ");
		System.out.println("++ ----------------------------------- ++");
		System.out.println(" | 1. Solve the first degree equation  |");
		System.out.println(" | 2. Solve the second degree equation |");
		System.out.println(" | 3. Caculate electricity bill        |");
		System.out.println(" | 4. Exit                             |");
		System.out.println("++ ----------------------------------- ++");

		Scanner scanner = new Scanner(System.in);
		byte selection = scanner.nextByte();

		switch (selection) {
		case 1:

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
			break;

		case 2:

			System.out.println("We have an equation of the form ax^2 + bx = c");
			System.out.print("Enter integer value a: ");
			a = scanner.nextInt();
			System.out.print("Enter integer value b: ");
			b = scanner.nextInt();
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

			break;

		case 3:

			System.out.print("Enter the electicity usage: ");
			int EU = scanner.nextInt();
			double bill;

			if (EU > 100) {
				bill = 100 * 1000 + (EU - 100) * 1500;
				System.out.println("The electricity bill is " + bill);
			} else {
				bill = EU * 1000;
				System.out.println("The electricity bill is " + bill);
			}

			break;

		default:
			System.exit(0);
			break;
		}

		scanner.close();
	}
}
