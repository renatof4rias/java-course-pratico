package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe sua Idade -> ");
		int idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de Idade");
		} else {
			System.out.println("Menor de Idade");
		}
		
		
		sc.close();
	}
}