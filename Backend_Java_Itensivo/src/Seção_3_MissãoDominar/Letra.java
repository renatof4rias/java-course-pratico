package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Letra {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe uma Letra do Alfabeto ->");
		char letra = sc.next().charAt(0);
		char letraLow = Character.toLowerCase(letra);

		switch (letraLow) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vogal");
			break;
		default:
			System.out.println("Consoante");
		}
		sc.close();
	}
}