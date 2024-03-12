package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int somador = 1;

		for (int contador = 1; contador <= 10; contador++) {

			System.out.println(somador);
			somador += contador;

		}

		sc.close();
	}

}
