package Seção_1_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o Valor de A: ");
		double a = sc.nextDouble();

		System.out.print("Digite o Valor de B: ");
		double b = sc.nextDouble();
		
		System.out.print("Digite o Valor de C: ");
		double c = sc.nextDouble();
		
		double media = (a + b + c) / 3;
		
		System.out.println("Valor Medio entre A,B e C: " + media);		
		
		
		sc.close();
	}

}
