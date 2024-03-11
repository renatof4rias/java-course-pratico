package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		final String SENHA = "senha123";

		System.out.print("Informe sua Senha | ");
		String senha = sc.nextLine();

		if (senha.equals(SENHA)) {
			System.out.println("Acesso concedido");
		} else {
			System.out.println("Acesso negado");
		}

		sc.close();
	}
}