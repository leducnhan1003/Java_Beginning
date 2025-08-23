package Lab1;

import java.util.Scanner;

public class Lab1Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the edge: ");
		double edge = scanner.nextDouble();
		double TT = Math.pow(edge, 3);

		System.out.println("The tich cua hinh lap phuong la " + TT);
		scanner.close();
	}
}
