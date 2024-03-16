package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[] array = { true, true, true, true, true, true, true, true, true, true, false};

		int contador = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == true) {
				contador++;
			}
		}

		if (contador == array.length) {
			System.out.println("TODOS SAO VERDADEIRO");
		} else if (contador != array.length) {
			System.out.println("NEM TODOS SAO VERDADEIRO");
		}

		sc.close();
	}

}
