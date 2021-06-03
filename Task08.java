package by.epam.unit04.main;

import java.util.Random;

public class Task08 {
	public static void main(String[] args) {
		int[][] mas = new int[4][3];
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
		int row;
		int column;
		row = 1;
		column = 3;
		if (row > mas.length || column > mas.length) {
			System.out.println("You've entered incorrect number of row or column.");
		} else {
			int p = row - 1; // row
			int k = column - 1; // column

			System.out.printf("[%2d]", mas[p][k]);

			System.out.println();
		}

	}

}
