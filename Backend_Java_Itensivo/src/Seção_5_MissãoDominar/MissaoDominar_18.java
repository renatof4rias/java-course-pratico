package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = { { 998, 121, 983 }, { 713, 943, 272 }, { 51, 82, 63 } };

		int produto = 1;
		int tamanhoMatriz = matriz.length;

		for (int i = 0; i < tamanhoMatriz; i++) {
			for (int j = 0; j < tamanhoMatriz; j++) {
				if (i + j > tamanhoMatriz - 1) {
					produto *= matriz[i][j];
				}
			}
		}

		System.out.println("O produto dos elementos abaixo da diagonal secundária é: " + produto);

		sc.close();
	}

}
