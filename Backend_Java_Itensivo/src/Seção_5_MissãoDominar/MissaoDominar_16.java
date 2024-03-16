package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = { { 998, 121, 983, 819 }, { 713, 943, 272, 613 }, { 51, 82, 63, 912 }, { 9111, 92, 43, 775 } };

		int soma = 0;
		int contador = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				soma += matriz[i][j];
				contador ++;

			}
		}
		double media = soma / contador;
		
		System.out.println("Total = " + soma);
		System.out.println("Media = " + media);

		sc.close();
	}

}
