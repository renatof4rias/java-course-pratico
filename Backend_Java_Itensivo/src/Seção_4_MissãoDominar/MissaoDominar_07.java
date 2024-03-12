package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um Texto -> ");
		String texto = sc.nextLine();

		System.out.println(contarVogais(texto));

		sc.close();
	}

	public static int contarVogais(String palavra) {

		int contador = 0;
		int index = palavra.length() - 1;

		for (int i = 0; i <= index; i++) {

			if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i'
					|| palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
				contador += 1;
			}

		}

		return contador;
	}

}
