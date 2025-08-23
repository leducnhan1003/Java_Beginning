package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of size of array: ");
		int size = sc.nextInt();
		int[] elements = new int[size];
		System.out.println("Enter the array elements: ");

		for (int i = 0; i < size; i++) {
			elements[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < a.length - 1; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}   
//		}
		System.out.println("Original sequence: " + Arrays.toString(elements));
		Arrays.sort(elements);
		System.out.println("After: " + Arrays.toString(elements));

//		System.out.println("Max = " + elements[elements.length - 1]);
//		System.out.println("Min = " + elements[0]);

		// max
		int max = elements[0];
		for (int i = 1; i < elements.length; i++) {
			max = Math.max(max, elements[i]);
		}
		System.out.println("Max = " + max);

		// min
		int min = elements[0];
		for (int i = 1; i < elements.length; i++) {
			min = Math.min(min, elements[i]);
		}
		System.out.println("Min = " + min);
	}
}
