package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Provas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nota P1");
		double p1 = sc.nextDouble();
		System.out.print("Nota P2");
		double p2 = sc.nextDouble();
		System.out.print("Nota P3");
		double p3 = sc.nextDouble();

		double media = (p1 + p2 + p3) / 3;

		if (media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media >= 4.0 || media <= 6.9) {
			System.out.println("Recuperação");
		} else if (media < 4.0) {
			System.out.println("Reprovado");
		}

		sc.close();
	}
}