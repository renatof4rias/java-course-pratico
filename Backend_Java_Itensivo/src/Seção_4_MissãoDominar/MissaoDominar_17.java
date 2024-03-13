package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor -> ");
		int numero = sc.nextInt();

		int contador = 0;
		do {

			if (contador % 2 == 0) {
				System.out.println(contador);
			}
			contador++;

		} while (contador <= numero);

		sc.close();
	}

}
