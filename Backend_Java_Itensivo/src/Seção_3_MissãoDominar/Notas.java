package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do Aluno: ");
		String nome = sc.nextLine();

		System.out.print("Nota P1: ");
		double p1 = sc.nextDouble();
		System.out.print("Nota P2: ");
		double p2 = sc.nextDouble();
		System.out.print("Nota P3: ");
		double p3 = sc.nextDouble();
		System.out.print("Media dos Exercicios: ");
		double me = sc.nextDouble();

		double media = (p1 + p2 * 2 + p3 * 3 + me) / 7;

		String conceito = "";
		String aprov = "";

		if (media >= 9.0) {
			conceito = "A";
			aprov = "Aprovado";
		} else if (media >= 7.5 && media < 9.0) {
			conceito = "B";
			aprov = "Aprovado";
		} else if (media >= 6.0 && media < 7.5) {
			conceito = "C";
			aprov = "Aprovado";
		} else if (media >= 4.0 && media < 6.0) {
			conceito = "D";
			aprov = "Reprovado";
		} else if (media < 4.0) {
			conceito = "E";
			aprov = "Reprovado";
		}

		System.out.println("Aluno: " + nome);
		System.out.println("Nota1: " + p1);
		System.out.println("Nota2: " + p2);
		System.out.println("Nota3: " + p3);
		System.out.println("Exercicios : " + me);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + conceito);
		System.out.println("Aproveitamento: " + aprov);

		sc.close();
	}
}
