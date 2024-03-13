package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Texto A -> ");
		String textoA = sc.nextLine();

		System.out.print("Texto B -> ");
		String textoB = sc.nextLine();

		System.out.printf("ANTES:  TextoA = %s TextoB = %s", textoA, textoB);
		System.out.println(substituirPalavra(textoA, textoB));

		sc.close();
	}

	public static String substituirPalavra(String stringA, String stringB) {

		String stringC = stringA;
		stringA = stringB;
		stringB = stringC;

		return String.format("""
				DEPOIS: TextoA = %s TextoB = %s
				""", stringA, stringB);
	}

}
