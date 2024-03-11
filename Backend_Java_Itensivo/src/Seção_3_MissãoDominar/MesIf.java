package Seção_3_MissãoDominar;

import java.util.Scanner;

public class MesIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor de 1 a 12 -> ");
		int value = sc.nextInt();

		if (value == 1) {
			System.out.println("JANEIRO");
		} else if (value == 2) {
			System.out.println("FEVEREIRO");
		} else if (value == 3) {
			System.out.println("MARCO");
		} else if (value == 4) {
			System.out.println("ABRIL");
		} else if (value == 5) {
			System.out.println("MAIO");
		} else if (value == 6) {
			System.out.println("JUNHO");
		} else if (value == 7) {
			System.out.println("JULHO");
		} else if (value == 8) {
			System.out.println("AGOSTO");
		} else if (value == 9) {
			System.out.println("SETEMBRO");
		} else if (value == 10) {
			System.out.println("OUTUBRO");
		} else if (value == 11) {
			System.out.println("NOVEMBRO");
		} else if (value == 12) {
			System.out.println("DEZEMBRO");
		} else {
			System.out.println("Mes Invalido");
		}

		sc.close();
	}
}
