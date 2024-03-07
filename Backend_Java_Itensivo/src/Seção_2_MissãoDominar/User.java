package Seção_2_MissãoDominar;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma Letra -> ");
		char letra = sc.next().charAt(0);

		String condition = "";

		if (Character.isDigit(letra) == true) {
			condition = "VERDADEIRO";
		} else if (Character.isDigit(letra) == false) {
			condition = "FALSO";
		}

		System.out.println(condition);

		sc.close();
	}

}
