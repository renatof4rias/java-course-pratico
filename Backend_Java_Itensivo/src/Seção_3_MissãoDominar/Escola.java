package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Escola {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de Horas: ");
		double horas = sc.nextDouble();
		
		System.out.print("Qual nivel ? ");
		int nivel = sc.nextInt();
		
		double salario = 0.0;
		
		if (nivel == 1) {
			salario = horas * 15.0;
		} else if(nivel == 2)	{
			salario = horas * 30.0;
		} else if (nivel == 3) {
			salario = horas * 50.0;
		}
		
		System.out.printf("Salario R$ %.2f ", salario);

		sc.close();
	}
}