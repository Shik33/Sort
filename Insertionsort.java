/**
 * Program for Insertion sort
 * @author shikhir
 *
 */
import java.util.Scanner;
public class Insertion {

	private static Scanner s;
	void sort(int A[]) {
		int n = A.length;
		for (int i = 1; i < n; ++i) {
			int key = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j = j - 1;
			}
			A[j + 1] = key;
		}
	}
	static void printArray(int A[]) {
		int n = A.length;
		for (int i = 0; i < n; ++i)
			System.out.print(A[i] + " ");
		System.out.println();
	}
	public static void main(String args[]) {
		s = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = s.nextInt();
		int A[] = new int[n];
		System.out.println("Enter elements");
		for (int i = 0; i < n; i++) {
			A[i] = s.nextInt();
		}
		for (int i : A) {
			System.out.println(i);
		}

		Insertion ob = new Insertion();
		ob.sort(A);

		printArray(A);
	}

}
