package Seção_5_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[] { 1, 2, 3, 4, 5 };

		double soma = 0.0;
		
		for (int i = 0; i<array.length; i++) {
			soma += array[i];
		}

		double media = soma/array.length; 
		System.out.println(media);
		
		sc.close();
	}

}
