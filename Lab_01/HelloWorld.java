package Lab1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter student's name: ");
		String name = scanner.nextLine();
		System.out.print("Enter student's score: ");
		float score = scanner.nextFloat();

		System.out.println(name + "Co diem = " + score);
		scanner.close();
	}

}
