package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma Palavra -> ");
		String string = sc.nextLine();
		verificarPalavra(string);

		sc.close();
	}

	public static void verificarPalavra(String string) {

		String strSemEspacos = string.replaceAll("\\s", "");
		int tamanho = (strSemEspacos.length() - 1);

		String stringA = "";
		String stringB = "";

		for (int i = 0; i <= tamanho; i++) {
			stringA += strSemEspacos.charAt(i);

		}
		for (int i = tamanho; i >= 0; i--) {
			stringB += strSemEspacos.charAt(i);

		}

		if (stringA.equalsIgnoreCase(stringB)) {
			System.out.printf("A Palavra %s é Palindromo", string);

		} else {
			System.out.printf("A Palavra %s nao é Palindromo", string);
		}

	}

}
