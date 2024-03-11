package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Valor da Compra -> ");
		double valor = sc.nextDouble();

		if (valor >= 100.0) {
			valor = valor - (valor * 0.1);
		}

		System.out.println("Total = " + valor);

		sc.close();

	}

}
