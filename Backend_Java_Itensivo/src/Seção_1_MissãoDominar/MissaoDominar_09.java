package Seção_1_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Valor da Base: ");
		double a = sc.nextDouble();

		System.out.print("Digite o Valor da Altura: ");
		double b = sc.nextDouble();

		double area = a * b / 2 ;

		System.out.println("Area do Retangulo: " + area);
		
		sc.close();
	}

}
