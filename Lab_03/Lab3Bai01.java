package Lab3;

import java.util.Scanner;

public class Lab3Bai01 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Enter an integer number: ");
//		int intnumber = scanner.nextInt();
//		int count = 0;
//
//		for (int i = 1; i < intnumber + 1; i++) {
//			if (intnumber % i == 0) {
//				count++;
//				System.out.println(i);
//			}
//
//		}
//		if (count > 2) {
//			System.out.println(intnumber + " is not a prime number");
//		} else {
//			System.out.println(intnumber + " is a prime number");
//		}
//
//		scanner.close();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào 1 số nguyên bất kỳ: ");
		int value = scanner.nextInt();
		scanner.close();

		boolean isPrime = true;
		if (value < 2) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(value); i++) { // tối ưu: chỉ cần đến căn bậc 2
				if (value % i == 0) {
					System.out.println("Ước số khác: " + i);
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.printf("%d là số nguyên tố", value);
		} else {
			System.out.printf("%d KHÔNG LÀ số nguyên tố", value);
		}
	}
}
