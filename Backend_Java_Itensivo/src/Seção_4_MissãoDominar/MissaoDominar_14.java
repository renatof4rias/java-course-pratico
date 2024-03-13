package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma Palavra -> ");
		String palavra = sc.nextLine();

		while (!palavra.equalsIgnoreCase("sair")) {

			String ignoreCase = palavra.toLowerCase();
			int contador = 0;

			for (int i = 0; i <= ignoreCase.length() - 1; i++) {
				
				if (ignoreCase.charAt(i) == 'a' || ignoreCase.charAt(i) == 'e' || ignoreCase.charAt(i) == 'i'
						|| ignoreCase.charAt(i) == 'o' || ignoreCase.charAt(i) == 'u') {
				
					contador += 1;

				}

			}
			System.out.println("Total de Vogais = " + contador);
			System.out.print("Digite uma Palavra ou Digite Sair para Encerrar -> ");
			palavra = sc.nextLine();

		}

		sc.close();
	}

}
