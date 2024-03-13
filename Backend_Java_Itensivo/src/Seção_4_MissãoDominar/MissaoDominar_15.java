package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digit um Numero ->");
		String numero = sc.nextLine();

		int soma = 0;

		for (int i = 0; i < numero.length(); i++) {
			soma += Character.getNumericValue(numero.charAt(i));
		}

		System.out.println("Soma dos Algarismos = " + soma);

		sc.close();
	}

}
