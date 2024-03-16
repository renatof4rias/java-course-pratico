package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = {{1, 2},{1, 2}}; 
		
		

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
