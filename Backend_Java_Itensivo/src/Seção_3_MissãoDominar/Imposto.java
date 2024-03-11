package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Imposto {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do produto -> ");
		double value = sc.nextDouble();

		String tabela = """
				[][][][][][][][][][][][][][][][][][][][][][][]
				[][]                                      [][]
				                  [][]   Insira o Digito Postal da Cidade   [][]
				[][]   1 - Sao Paulo                      [][]
				[][]   2 - Rio de Janeiro                 [][]
				[][]   3 - Outros estados                 [][]
				[][]                                      [][]
				[][][][][][][][][][][][][][][][][][][][][][][]
				""";
		System.out.println(tabela);
		int digito = sc.nextInt();

		if (digito == 1) {
			System.out.printf("SubTotal = R$ %.2f Imposto = 3%% Total = R$ %.2f ", value, (value + (value * 0.03)));
		} else if (digito == 2) {
			System.out.printf("SubTotal = R$ %.2f Imposto = 2%% Total = R$ %.2f ", value, (value + (value * 0.02)));
		} else if (digito == 3) {
			System.out.printf("SubTotal = R$ %.2f Imposto = 1%% Total = R$ %.2f ", value, (value + (value * 0.01)));
		}

		sc.close();
	}
}
