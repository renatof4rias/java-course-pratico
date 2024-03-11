package Seção_3_MissãoDominar;

import java.util.Scanner;

public class LetraIf {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe uma Letra do Alfabeto ->");
		char letra = sc.next().charAt(0);
		char letraLow = Character.toLowerCase(letra);

		boolean isVogal = letraLow == 'a' || letraLow == 'e' || letraLow == 'i' || letraLow == 'o' || letraLow == 'u';

		if (isVogal == true) {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}

		sc.close();
	}
}
