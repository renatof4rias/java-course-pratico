package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 5, 5, 5, 5, 5, 10, 12, 432, 52, 456, 3112, 123, 53452, 64, 567, 234, 5345,
				62345, 1234, 5, -1 };

		int contador = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 5) {
				contador++;
			}

		}

System.out.println("O Numero 5 Apareceu " + contador + " Vezes");
		
		sc.close();
	}

}
