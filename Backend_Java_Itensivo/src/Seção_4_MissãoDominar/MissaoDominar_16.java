package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor -> ");
		int numero = sc.nextInt();

		int soma = 0;

		while (numero != -1) {
			soma += numero;
			System.out.print("Valor -> ");
			numero = sc.nextInt();

		}

		System.out.println("Total " + soma);

		sc.close();
	}

}
