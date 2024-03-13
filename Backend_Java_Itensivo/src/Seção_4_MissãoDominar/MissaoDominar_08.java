package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Texto -> ");
		String string = sc.nextLine();

		System.out.println(converterCamelCase(string));

		sc.close();
	}

	public static String converterCamelCase(String string) {

		int index = string.length() - 1;

		String stringReturn = "";

		for (int i = 0; i <= index; i++) {

			if (Character.isUpperCase(string.charAt(i))) {
				stringReturn = stringReturn + " " + string.charAt(i);
			} else if (Character.isLowerCase(string.charAt(i))) {
				stringReturn = stringReturn + string.charAt(i);
			}

		}

		return stringReturn;
	}

}
