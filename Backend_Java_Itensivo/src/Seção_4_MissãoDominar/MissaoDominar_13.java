package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String password = "1234";

		System.out.print("Senha -> ");
		String senha = sc.nextLine();

		boolean isOk = true;

		do {

			if (senha.equals(password)) {
				System.out.println("Acesso Permitido");
				isOk = false;
			} else if (!senha.equals(password)) {
				System.out.println("Senha Incorreta, Insira Novamente");
				System.out.print("Senha -> ");
				senha = sc.nextLine();
				isOk = true;
			}

		} while (isOk == true);

		sc.close();
	}

}
