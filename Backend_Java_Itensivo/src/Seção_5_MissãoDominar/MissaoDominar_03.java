package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 432, 52, 456, 3112, 123, 53452, 64, 567, 234, 5345,
				62345, 1234, 5, -1 };

		int maior = array[0];
		int menor = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > maior) {
				maior = array[i];
			}

		}

		for (int i = 0; i < array.length; i++) {

			if (array[i] < menor) {
				menor = array[i];
			}

		}

		System.out.println("Maior Valor = " + maior);

		System.out.println("Menor Valor = " + menor);

		sc.close();
	}

}
