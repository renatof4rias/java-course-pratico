package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Detran {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ano: ");
		int ano = sc.nextInt();

		System.out.print("Valor Tabela: ");
		double valor = sc.nextDouble();

		double imposto = 0.0;

		if (ano < 1990) {
			imposto = valor * 0.01;
		} else if (ano >= 1990) {
			imposto = valor * 0.015;
		}

		System.out.printf("Taxa de Transferencia = R$ %.2f", imposto);

		sc.close();
	}

}
