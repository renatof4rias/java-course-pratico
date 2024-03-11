package Seção_3_MissãoDominar;

import java.util.Scanner;

public class DiaIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor de 1 a 7 -> ");
		int value = sc.nextInt();

		if (value == 1) {
			System.out.println("Segunda");
		} else if (value == 2) {
			System.out.println("Terça");
		} else if (value == 3) {
			System.out.println("Quarta");
		} else if (value == 4) {
			System.out.println("Quinta");
		} else if (value == 5) {
			System.out.println("Sexta");
		} else if (value == 6) {
			System.out.println("Sabado");
		} else if (value == 7) {
			System.out.println("Domingo");
		} else {
			System.out.println("Dia Invalido");
		}

		sc.close();
	}
}