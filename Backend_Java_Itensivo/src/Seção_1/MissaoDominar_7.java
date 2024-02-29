package Seção_1;

import java.util.Scanner;

public class MissaoDominar_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Valor de a: ");
		double a = sc.nextDouble();

		System.out.print("Digite o Valor de b: ");
		double b = sc.nextDouble();

		a = a + b; // 15
		b = a - b; // 10
		a = a - b; // 5

		System.out.println("Valores trocados:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		sc.close();
	}

}
