package Seção_1;

import java.util.Scanner;

public class MissaoDominar_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Insira o Valor do Produto: ");
		double a = sc.nextDouble();

		System.out.print("Insira o Porcentagem de Desconto do Produto: ");
		double b = sc.nextDouble();
		
		double porcentagem = b / 100;
		double total = a - (a * porcentagem);
		
		
		System.out.println("Total a Pagar: R$ " + total);
		
		sc.close();
	}

}
