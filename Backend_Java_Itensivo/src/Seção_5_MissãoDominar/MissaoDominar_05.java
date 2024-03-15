package Seção_5_MissãoDominar;

import java.util.Arrays;
import java.util.Scanner;

public class MissaoDominar_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] palavras = new String[] { "Caixa", "Lapis", "Caneta", "Celular", "Telefone", "Garrafa", "Agua",
				"Livro" };
		System.out.println(Arrays.toString(palavras));

		Arrays.sort(palavras);

		System.out.println(Arrays.toString(palavras));

		sc.close();
	}

}
