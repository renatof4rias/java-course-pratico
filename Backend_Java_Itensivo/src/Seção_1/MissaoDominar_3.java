package Seção_1;

import java.util.Scanner;

public class MissaoDominar_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite a medida em METROS: ");
		double a = sc.nextDouble();

		double centimetros = a * 100.0 ;
		double milimetros = a * 1000.0 ;
		
		System.out.println("RESULTADO");
		System.out.println("METROS: " + a);
		System.out.println("CENTIMETROS: " + centimetros);
		System.out.println("MILIMETROS: " + milimetros);
		
		sc.close();
	}

}
