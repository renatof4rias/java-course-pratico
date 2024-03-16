package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = {{1, 2, 3},{1, 2, 3}, {1,2,3}}; 

		
		int Soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				Soma += matriz[i][j];
			}
		}
		
		System.out.println(Soma);
		sc.close();
	}

}
