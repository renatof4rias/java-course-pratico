package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor da Base = ");
		double base = sc.nextDouble();
		System.out.print("Valor do Labo B = ");
		double ladoB = sc.nextDouble();
		System.out.print("Valor do Labo C = ");
		double ladoC = sc.nextDouble();

		if (base == ladoB && base == ladoC) {
			System.out.println("Triângulo Equilátero");
		} else if (base == ladoB || ladoB == ladoC || ladoC == base) {
			System.out.println("Triângulo Isósceles");
		} else if (base != ladoB && base != ladoC && ladoB != ladoC) {
			System.out.println("Triângulo Escaleno");

		} else {
			System.out.println("Fora do Alcance");
		}

		sc.close();
	}

}
