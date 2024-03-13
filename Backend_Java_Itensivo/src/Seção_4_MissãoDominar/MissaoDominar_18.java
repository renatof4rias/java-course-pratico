package Seção_4_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_18 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		
		System.out.print("DIGITE O CPF -> ");
		String cpf = sc.nextLine();
		
		
		if (cpf.length() != 11) {
			System.out.println("CPF INVALIDO");
		} else {
			System.out.println("CPF VALIDO");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}


}
