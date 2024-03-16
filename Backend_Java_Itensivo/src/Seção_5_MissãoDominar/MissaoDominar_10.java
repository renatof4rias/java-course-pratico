package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] palavras = new String[] { "Caixa", "Lapis", "Computador", "aqwewrwedfadfae", "Macarronada", "Caneta",
				"Celular", "Telefone", "Garrafa", "Agua", "Livro", "Funcionario", "" };

		int tamanho = 0;
		String maiorPalavra = "";

		for (int i = 0; i < palavras.length; i++) {

			if (palavras[i].length() >= tamanho) {
				tamanho = palavras[i].length();
				maiorPalavra = palavras[i];
			}

		}

		System.out.println("Maior Palavra é -> " + maiorPalavra + " com " + tamanho + " Letras");
		sc.close();
	}

}