package by.epam.unit04.main;

public class Task10 {

	public static void main(String[] args) {
		int n = 7;
		int[][] mas = new int[n][n];
		for (int i = 0; i < mas.length; i++) {
			mas[i][0] = 1;
			mas[0][i] = 1;
			mas[i][n - 1] = 1;
			mas[n - 1][i] = 1;
		}
		;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				System.out.printf("[%2d]", mas[i][j]);
			}
			System.out.println();
		}
	}

}
