package Seção_1;

import java.util.Scanner;

public class MissaoDominar_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Valor da Base: ");
		double a = sc.nextDouble();

		System.out.print("Digite o Valor da Altura: ");
		double b = sc.nextDouble();

		double area = a * b;
		double perimetro = 2 * (a + b);

		System.out.println("Area do Retangulo: " + area);
		System.out.println("Area do Perimetro: " + perimetro);
		
		sc.close();
	}

}
