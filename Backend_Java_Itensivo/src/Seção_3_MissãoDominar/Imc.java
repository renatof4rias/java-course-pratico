package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu Peso >");
		double peso = sc.nextDouble();
		
		System.out.print("Informe sua Altura >");
		double altura = sc.nextDouble();
		
		
		
		double imc = peso / (altura * altura);
		System.out.println(imc);
		
		if (imc < 18.5) {
			System.out.println("Abaixo do Peso");
		} else if (imc >= 18.5 && imc <= 25){
			System.out.println("Peso Normal");
		} else if (imc >= 25 && imc <= 30){
			System.out.println("Acima do Peso");
		} else if (imc > 30){
			System.out.println("Obeso");
		}


		
		
		sc.close();
	}
}