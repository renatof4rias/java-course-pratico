package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 5, 5, 5, 5, 5, 10, 12, 432, 52, 456, 3112, 123, 53452,
				64, 567, 234, 5345, 62345, 1234, 5, -1 };

		boolean temRepetidos = false;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {
					temRepetidos = true;
					break;
				}

			}

			if (temRepetidos) {
				break;
			}
		}

		if (temRepetidos) {
			System.out.println("O array contém valores repetidos.");
		} else {
			System.out.println("O array não contém valores repetidos.");
		}

		sc.close();
	}

}
