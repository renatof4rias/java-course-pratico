package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Divisivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor qualquer -> ");
		double value = sc.nextDouble();

		if (value % 3 == 0 && value % 5 == 0) {
			System.out.println("DIVISIVEL");
		} else {
			System.out.println("NAO DIVISIVEL");
		}

		sc.close();
	}
}
