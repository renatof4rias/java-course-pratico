package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = { { 998, 121, 983 }, { 713, 943, 272 }, { 51, 82, 63 } };

		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = i + 1; j < matriz[i].length; j++) {

				soma += matriz[i][j];

			}
		}

		System.out.println("Total = " + soma);

		sc.close();
	}

}