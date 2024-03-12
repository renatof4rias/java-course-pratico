package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um Texto -> ");
		String aaa = sc.nextLine();

		int tamanho = aaa.length() - 1;

		for (int contador = tamanho; contador >= 0; contador--) {

			System.out.println(aaa.charAt(contador));

		}

		sc.close();
	}

}
