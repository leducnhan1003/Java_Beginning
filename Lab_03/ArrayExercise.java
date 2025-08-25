package Java_beginning.Lab_03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise {
	public static void main(String[] args) {
//		int[] clubs = { 15, 10, 1, 16, 3 };
//		
//		Cách làm thủ công:
//		for (int i = 0; i < clubs.length - 1; i++) {
//			for (int j = i + 1; j < clubs.length; j++) {
//				if (clubs[i] > clubs[j]) {
//					int temp = clubs[i];
//					clubs[i] = clubs[j];
//					clubs[j] = temp;
//				}
//
//			}
//		}
//		System.out.println(Arrays.toString(clubs));
//
//		Arrays.sort(clubs);
//		System.out.println(Arrays.toString(clubs));

//=========================================================================================================

//		Bài luyện tập:
//		Bài 1. Nhập các giá trị số vào mảng gồm n phần tử. In ra số nhỏ nhất và số lớn nhất trong mảng:
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number of size of array: ");
//		int size = sc.nextInt();
//		int[] elements = new int[size];
//		System.out.print("Enter the array elements: ");
//
//		for (int i = 0; i < size; i++) {
//			elements[i] = sc.nextInt();
//		}
//		sc.close();
//		System.out.println(Arrays.toString(elements));

		// Sắp xếp từ lớn đến bé và ngược lại:
//		for (int j = 0; j < elements.length - 1; j++) {
//			for (int k = j + 1; k < elements.length; k++) {
//				int temp = elements[j];
//				if (elements[j] > elements[k]) {
//					elements[j] = elements[k];
//					elements[k] = temp;
//				}
//			}
//		}
//		Arrays.sort(elements);
//		System.out.println(Arrays.toString(elements));

		// tìm giá trị lớn nhất/nhỏ nhất:
//		int max = elements[0];
//		for (int k = 1; k < elements.length; k++) {
//			max = Math.max(max, elements[k]);
//		}
//		System.out.println("Max = " + max);
//
//		int min = elements[0];
//		for (int k = 1; k < elements.length; k++) {
//			min = Math.min(min, elements[k]);
//		}
//		System.out.println("Min = " + min);

//========================================================================================================================
//		Bài 2. Nhập dữ liệu vào mảng có n số nguyên. Nhập số nguyên X. Cho biết X có thuộc mảng hay không
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number of size of array: ");
//		int size = sc.nextInt();
//		int[] elements = new int[size];
//		System.out.print("Enter the array elements: ");
//		for (int j = 0; j < size; j++) {
//			elements[j] = sc.nextInt();
//		}
//
//		System.out.println(Arrays.toString(elements));
//
//		System.out.print("Enter an integer number: ");
//		int intNumber = sc.nextInt();
//		sc.close();
//		int count = 0;
//
//		for (int i = 0; i < elements.length - 1; i++) {
//			if (intNumber == elements[i]) {
//				count++;
//			}
//		}
//		if (count > 0) {
//			System.out.printf("%d already exists in the array", intNumber);
//		} else {
//			System.out.printf("%d doesn't exist in the array", intNumber);
//		}
//==============================================================================================================================
//		Bài 3.  Nhập dữ liệu vào mảng có n số nguyên. Nhập số nguyên X. In ra vị trí các phần tử trong mảng có giá trị bằng X
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number of size of array: ");
//		int size = sc.nextInt();
//		int[] elements = new int[size];
//		System.out.print("Enter the array elements: ");
//		for (int j = 0; j < size; j++) {
//			elements[j] = sc.nextInt();
//		}
//
//		System.out.println(Arrays.toString(elements));
//
//		System.out.print("Enter an integer number: ");
//		int intNumber = sc.nextInt();
//		sc.close();
//
//		for (int i = 0; i < elements.length; i++) {
//			if (intNumber == elements[i]) {
//				System.out.printf(elements[i] + " in " + i + " index \n");
//
//			}
//		}
// ================================================================================================================================
// 		Bài 6.  Nhập vào một mảng các số nguyên. In ra một số kết quả sau: số lượng số âm, tổng số số âm, số lượng số dương, tổng số số dương trong mảng.
//
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of size of array: ");
		int size = sc.nextInt();
		int[] elements = new int[size];
		System.out.print("Enter the array elements: ");
		for (int j = 0; j < size; j++) {
			elements[j] = sc.nextInt();
		}

		System.out.println(Arrays.toString(elements));

		int countNega = 0;
		int countPosi = 0;

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] < 0) {
				countNega++;
			}
			if (elements[i] > 0) {
				countPosi++;
			}
		}

		int[] eNega = new int[countNega];
		int[] ePosi = new int[countPosi];
		int j = 0;
		int k = 0;

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] < 0) {
				int tempN = elements[i];

				while (j < eNega.length) {
					eNega[j] = tempN;
					j++;
					break;
				}
			}

			if (elements[i] > 0) {
				int tempP = elements[i];
				while (k < ePosi.length) {
					ePosi[k] = tempP;
					k++;
					break;
				}
			}
		}

		Arrays.sort(eNega);
		Arrays.sort(ePosi);
		System.out.println("Negative number: " + Arrays.toString(eNega));
		System.out.println("Positive number: " + Arrays.toString(ePosi));
		sc.close();
// =======================================================================================================
	}
}
