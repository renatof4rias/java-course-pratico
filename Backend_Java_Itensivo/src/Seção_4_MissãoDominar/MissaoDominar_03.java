package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite Uma Palavra -> ");
		String word = sc.nextLine();

		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i) + " " + i);

		}

		sc.close();
	}

}
