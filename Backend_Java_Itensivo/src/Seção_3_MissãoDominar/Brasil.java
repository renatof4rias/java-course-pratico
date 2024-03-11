package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Brasil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Infome o Codigo Postal BR/US/EU : ");
		String codigo = sc.nextLine();

		System.out.print("Valor do Produto: ");
		double valor = sc.nextDouble();

		double taxa = 0.0;

		if (codigo.equals("BR")) {
			taxa = (valor * 0.1);
		} else if (codigo.equals("US")) {
			taxa = (valor * 0.05);
		} else if (codigo.equals("EU")) {
			taxa = (valor * 0.03);
		}

		double total = taxa + valor;

		System.out.printf("Produto: R$ %.2f", valor);
		System.out.printf("\nCodigo Postal: %s", codigo);
		System.out.printf("\nTaxa: R$ %.2f", taxa);
		System.out.printf("\nTotal: R$ %.2f", total);

		sc.close();
	}

}
