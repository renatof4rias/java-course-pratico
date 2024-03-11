package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Valor do Produto: ");
		double valor = sc.nextDouble();

		String pagamento = """
				QUAL A FORMA DE PAGAMENTO ?
				1 - Dinheiro/Cheque
				2 - 1x Credito
				3 - 2x Credito s/ Juros
				4 - 3x Credito c/ Juros
				""";
		System.out.println(pagamento);
		int formaPagamento = sc.nextInt();

		if (formaPagamento == 1) {
			valor = valor - (valor * 0.1);
			System.out.printf("Total = %.2f", valor);
		} else if (formaPagamento == 2) {
			valor = valor - (valor * 0.15);
			System.out.printf("Total = %.2f", valor);
		} else if (formaPagamento == 3) {
			System.out.printf("Total = %.2f 2x ", (valor / 2));
		} else if (formaPagamento == 4) {
			valor = valor + (valor * 0.025);
			System.out.printf("Total = %.2f 3x ", (valor / 3));
		}

		sc.close();
	}

}
