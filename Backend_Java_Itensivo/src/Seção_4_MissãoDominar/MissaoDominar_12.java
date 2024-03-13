package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 1;
		int soma = 0;

		while (contador <= 100) {

			if (contador % 2 != 0) {
				soma += contador;
			}
			contador++;
		}

		System.out.println("Soma Total = " + soma);

		sc.close();
	}

}
