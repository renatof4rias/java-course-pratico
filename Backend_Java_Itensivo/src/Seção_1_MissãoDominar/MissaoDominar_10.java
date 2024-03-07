package Seção_1_MissãoDominar;

import java.util.Scanner;

public class MissaoDominar_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos Funcionarios ? ");
		int totalFuncionarios = sc.nextInt();

		double somaSalarios = 0.0;
		for (int i = 0; i < totalFuncionarios; i++) {
			System.out.print("Informe o Salario do " + (i + 1) + "o Funcionario: ");
			somaSalarios += sc.nextDouble();
		}

		double mediaSalarios = somaSalarios / totalFuncionarios;

		System.out.println("Media Salarial da Empresa: R$" + mediaSalarios);

		sc.close();
	}

}
