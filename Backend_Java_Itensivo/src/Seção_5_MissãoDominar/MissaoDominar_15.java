package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = { { 998, 121, 983, 819 }, { 713, 943, 272, 613 }, { 51, 82, 63, 912 }, { 9111, 92, 43, 775 } };

		int maior = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}

			}
		}

		System.out.println("Maior = " + maior);

		sc.close();
	}

}
