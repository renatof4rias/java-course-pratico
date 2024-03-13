package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite Valor de A -> ");
		int a = sc.nextInt();

		System.out.print("Digite Valor de B -> ");
		int b = sc.nextInt();

		System.out.println("Maior = " + encontrarMaiorNumero(a, b));

		sc.close();
	}

	public static int encontrarMaiorNumero(int a, int b) {

		int maior = 0;

		if (a > b) {
			maior = a;
		} else if (b > a) {
			maior = b;
		}

		return maior;

	}

}
