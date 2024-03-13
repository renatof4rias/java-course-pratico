package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor -> ");
		int numero = sc.nextInt();

		for (int i = 0; i <= 10; i++) {

			System.out.printf("%d   * %d = %d\n", i, numero, (i * numero));
		}

		sc.close();
	}

}
