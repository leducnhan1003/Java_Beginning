package Lab1;

import java.util.Scanner;

public class Lab1Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Length: ");
		double length = scanner.nextDouble();
		System.out.print("Enter Width: ");
		double width = scanner.nextDouble();

		double CV = (length + width) * 2;
		double DT = length * width;

		System.out.println("Chu vi = " + CV);
		System.out.println("Dien tich = " + DT);
		System.out.println("Canh nho nhat la " + Math.min(length, width));
		scanner.close();
	}
}