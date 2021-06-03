package by.epam.unit04.main;

import java.util.Random;

public class Task07 {
	public static void main(String[] args) {
		int[][] mas = new int[7][7];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d]", mas[i][j]);
			}
			System.out.println();
		}
		int i;
		int j;
		for (i = 0, j = 0; i < mas.length; i++, j++) {

			System.out.printf("[%2d]", mas[i][j]);

			System.out.println();
		}
	}
}
