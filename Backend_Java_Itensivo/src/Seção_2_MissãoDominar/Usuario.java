package Seção_2_MissãoDominar;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um Número Inteiro -> ");
		String valorString = sc.nextLine();

		int valorInteiro = (Integer.parseInt(valorString) * 2);

		System.out.println(valorInteiro);

		sc.close();
	}

}
