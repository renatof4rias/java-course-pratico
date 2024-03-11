package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Data {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Dia: ");
		int dia = sc.nextInt();
		boolean isValidDia = (dia > 0) && (dia < 32);

		System.out.print("Mes: ");
		int mes = sc.nextInt();
		boolean isValidMes = (mes > 0) && (mes < 13);

		System.out.print("Ano: ");
		int ano = sc.nextInt();
		boolean isValidAno = (String.valueOf(ano).length() == 4);

		boolean is30 = mes == 4 || mes == 6 || mes == 9 || mes == 11;
		boolean is31 = mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12;
		boolean isBissexto = (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);

		if ((isValidDia == false) || (isValidMes == false) || (isValidAno == false)) {
			System.out.println("Data Invalida");
		} else if (is30 == true) {
			if (dia <= 30) {
				System.out.println("Data Valida 30");
			} else if (dia > 30) {
				System.out.println("Data Invalida 30");
			}
		} else if (is31 == true) {
			if (dia <= 31) {
				System.out.println("Data Valida 31");
			} else if (dia > 31) {
				System.out.println("Data Invalida 31");
			}
		} else if (mes == 2) {
			if (isBissexto == true && (dia > 0 && dia < 30)) {
				System.out.println("Data Valida");
			} else if ((isBissexto == false && dia > 0 && dia > 28) || (isBissexto == true && dia > 0 && dia > 29)) {
				System.out.println("Data invalida 1");
			}
		}

		sc.close();
	}

}
