package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] array = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };

		int contadorVogais = 0;
		int contadorConsoantes = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u') {
				contadorVogais++;
			} else {
				contadorConsoantes++;
			}
		}

		System.out.println("Total Vogais = " + contadorVogais);
		System.out.println("Total Consoantes = " + contadorConsoantes);

		sc.close();
	}

}
