package Seção_1;

import java.util.Scanner;

public class MissaoDominar_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Valor da Base: ");
		double a = sc.nextDouble();

		System.out.print("Digite o Valor do Expoente: ");
		double b = sc.nextDouble();
		
		double c = Math.pow(a, b);
		
		System.out.println("RESULTADO: " + c);
		sc.close();
	}

}
