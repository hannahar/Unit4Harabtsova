package by.epam.unit04.main;

public class Task03 {
	public static void main(String[] args) {
		int[] mas = new int[] { 12, -3, 89, -76, -8, 0, -19, 0, 0, 56 };
		int size;
		size = mas.length;

		int countPositive;
		countPositive = 0;
		int countNegative;
		countNegative = 0;
		int countZero;
		countZero = 0;
		for (int i = 0; i < size; i++) {
			if (mas[i] > 0) {
				countPositive++;
			} else if (mas[i] == 0) {
				countZero++;
			} else if (mas[i] < 0) {
				countNegative++;
			}

		}
		System.out.println("Negative count is " + countNegative);
		System.out.println("Postive count is " + countPositive);
		System.out.println("Zero count is " + countZero);
	}

}
