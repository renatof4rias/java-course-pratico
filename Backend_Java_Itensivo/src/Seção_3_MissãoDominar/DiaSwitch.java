package Seção_3_MissãoDominar;

import java.util.Scanner;

public class DiaSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor de 1 a 7 -> ");
		int value = sc.nextInt();

		switch (value) {
		case 1:
			System.out.println("SEGUNDA");
			break;
		case 2:
			System.out.println("TERCA");
			break;
		case 3:
			System.out.println("QUARTA");
			break;
		case 4:
			System.out.println("QUINTA");
			break;
		case 5:
			System.out.println("SEXTA");
			break;
		case 6:
			System.out.println("SABADO");
			break;
		case 7:
			System.out.println("DOMIGO");
			break;
		default:
			System.out.println("DIA INVALIDO");
			break;
		}

		sc.close();
	}
}