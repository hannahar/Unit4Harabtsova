package by.epam.unit04.main;

public class Task02 {
	public static void main(String[] args) {
		{
			int[] mas = new int[] { 7, -3, 13,-10 };
			
			int maxNumber;
			maxNumber = mas[0];
			int minNumber;
			minNumber = 0;

			for (int i = 1; i < mas.length; i++) {
				int number;
				number = mas[i - 1];

				if (number > mas[i]) {
					maxNumber = number;
					minNumber = mas[i];

				} else {
					maxNumber = mas[i];
					minNumber = number;

				}
				
			}
		System.out.println("Min number =" + minNumber);
			System.out.println("Max number =" + maxNumber);
		
			int k;
			k = maxNumber - minNumber; // длина числовой оси
			System.out.println("k = " + k);
		}
	}

}
