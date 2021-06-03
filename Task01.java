package by.epam.unit04.main;

import java.util.Random;

public class Task01 {
	public static void main(String[] args) {
		int n;
		n = 5;
		int[] mas1 = new int[n];
		Random rand = new Random();

		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = rand.nextInt(100);
		}
		for (int i = 0; i < mas1.length; i++) {
			System.out.printf("%3d", mas1[i]);
		}
		System.out.println();

		int count;
		count = 0;
		int i;

		for (i = 0; i < mas1.length; i++) {
			{
				if (mas1[i] % 2 == 0) {
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("There are no even numbers!");
		} else {

			int[] mas2 = new int[count];
			int j;

			for (i = 0, j = 0; i < mas1.length; i++) {
				if (mas1[i] % 2 == 0) {
					mas2[j] = mas1[i];
					j++;
				}

			}
			for (j = 0; j < mas2.length; j++) {
				System.out.printf("%3d", mas2[j]);
			}
		}
	}

}
