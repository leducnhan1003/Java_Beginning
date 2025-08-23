package Lab2;

import java.util.Scanner;

public class Lab2Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

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

		scanner.close();
	}
}
