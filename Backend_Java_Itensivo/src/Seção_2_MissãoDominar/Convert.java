package Seção_2_MissãoDominar;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um Número Inteiro -> ");
		int valorInteiro = sc.nextInt();
		System.out.println(converterParaString(valorInteiro));

		var condition = converterParaString(valorInteiro);

		if (condition instanceof String) {
			System.out.println("Verdade");
		} else {
			System.out.println("Falso");
		}

		sc.close();
	}

	public static String converterParaString(int valorInteiro) {
		String a = String.valueOf(valorInteiro);
		return a;
	}

}