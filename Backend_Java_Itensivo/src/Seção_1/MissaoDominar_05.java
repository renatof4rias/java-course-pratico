package Seção_1;

import java.util.Scanner;

public class MissaoDominar_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Valor de A: ");
		double a = sc.nextDouble();

		System.out.print("Digite o Valor de B: ");
		double b = sc.nextDouble();
		
		System.out.print("Digite o Valor de C: ");
		double c = sc.nextDouble();
		
		double x = (c - b) / a;
		double equacao = (a*x) + b;
		
		 if (equacao == c) {
	            System.out.println("A equação é verdadeira para x = " + x);
	        } else {
	            System.out.println("A equação é falsa para x = " + x);
	        }
		
		sc.close();
	}

}
