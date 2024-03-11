package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Impar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor qualquer -> ");
		double value = sc.nextDouble();

		if (value % 2 == 0) {
			System.out.println("VALOR PAR " + value + " + 5 = " + (value + 5));
		} else {
			System.out.println("VALOR IMPAR " + value + " * 3 = " + (value + 8));
		}

		sc.close();
	}
}
