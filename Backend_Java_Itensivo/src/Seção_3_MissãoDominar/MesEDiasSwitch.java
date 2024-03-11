package Seção_3_MissãoDominar;

import java.util.Scanner;

public class MesEDiasSwitch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor de 1 a 12 -> ");
		int value = sc.nextInt();

		switch (value) {
		case 1:
			System.out.println("JANEIRO POSSUI 31 DIAS");
			break;
		case 2:
			System.out.println("FEVEREIRO POSSUI 28 DIAS");
			break;
		case 3:
			System.out.println("MARCO POSSUI 31 DIAS");
			break;
		case 4:
			System.out.println("ABRIL POSSUI 30 DIAS");
			break;
		case 5:
			System.out.println("MAIO POSSUI 31 DIAS");
			break;
		case 6:
			System.out.println("JUNHO POSSUI 30 DIAS");
			break;
		case 7:
			System.out.println("JULHO POSSUI 31 DIAS");
			break;
		case 8:
			System.out.println("AGOSTO POSSUI 31 DIAS");
			break;
		case 9:
			System.out.println("SETEMBRO POSSUI 30 DIAS");
			break;
		case 10:
			System.out.println("OUTUBRO POSSUI 31 DIAS");
			break;
		case 11:
			System.out.println("NOVEMBRO POSSUI 30 DIAS");
			break;
		case 12:
			System.out.println("DEZEMBRO POSSUI 31 DIAS");
			break;
		default:
			System.out.println("Mes Invalido");
			break;
		}
		;

		sc.close();
	}
}
