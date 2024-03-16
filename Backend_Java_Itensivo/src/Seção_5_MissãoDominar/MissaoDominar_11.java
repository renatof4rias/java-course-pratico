package Seção_5_MissãoDominar;

import java.util.Arrays;
import java.util.Scanner;

public class MissaoDominar_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 5, 5, 5, 5, 5, 10, 12, 432, 52, 456, 3112, 123, 53452,
				64, 567, 234, 5345, 62345, 1234, 5 };

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

		int segundoMaior = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] != array[j]) {
					segundoMaior = array[j];
					j = array.length;
					i = array.length;
				}
			}
		}

		System.out.println(segundoMaior);

		sc.close();
	}
}