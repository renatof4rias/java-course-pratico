package Seção_3_MissãoDominar;

import java.util.Scanner;

public class DoubleNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor qualquer -> ");
		double value = sc.nextDouble();

		if (value >= 0) {
			System.out.println("VALOR POSITIVO " + value + " * 2 = " + (value * 2));
		} else {
			System.out.println("VALOR NEGATIVO " + value + " * 3 = " + (value * 3));
		}

		sc.close();
	}
}