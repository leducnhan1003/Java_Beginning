package Lab2;

import java.util.Scanner;

public class Baitap_ifelse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Salary: ");
		int salary = scanner.nextInt();

		if (salary < 10000000) {
			System.out.println("no tax");
		} else if (salary < 15000000) {
			System.out.println("10% tax");
		} else if (salary < 30000000) {
			System.out.println("20% tax");
		} else {
			System.out.println("50% tax");
		}
		scanner.close();
	}
}
