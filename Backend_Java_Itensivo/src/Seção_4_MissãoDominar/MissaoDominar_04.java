package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um Numero -> ");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		sc.close();
	}

}
