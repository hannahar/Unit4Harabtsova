package by.epam.unit04.main;

import java.util.Random;

public class Task05 {
	public static void main(String[] args) {

		int n;
		n = 5;
		int[] mas = new int[n];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%3d", mas[i]);
		}
		System.out.println();

		for (int i = 0; i < mas.length - 1; i++) {

			int min = mas[i];
			int k = i; // remember index of min
			for (int j = i + 1; j < mas.length; j++) {

				// find the smallest number in the mas
				if (mas[j] < min) {
					min = mas[j];
					k = j;
				}
			}
			// move the smallest one to the beginning of mas
			if (i != k) {
				int temp = mas[i];
				mas[i] = mas[k];
				mas[k] = temp;
			}

		}
		for (int i = 0; i < mas.length; i++) {

			System.out.printf("%4d", mas[i]);
		}
	}
}
