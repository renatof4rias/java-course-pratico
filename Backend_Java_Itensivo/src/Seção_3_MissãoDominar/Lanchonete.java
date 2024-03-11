package Seção_3_MissãoDominar;

import java.util.Scanner;

public class Lanchonete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String cardapio = 
						"""
                       100  - Cachorro Quente R$ 2,00
                       101  - Bauru Simples   R$ 1,50
                       102  - Bauru c/ Ovo    R$ 3,50
                       103  - Hamburger       R$ 4,00
                       104  - Cheeseburger    R$ 6,00
                       105  - Refrigerante    R$ 5,00
						""";
		
		System.out.println(cardapio);
		
		
		System.out.print("Informe o numero do Pedido: ");
		int numero = sc.nextInt();
		
		System.out.print("Quantas unidades: ");
		int quantidade = sc.nextInt();
		
		double total = 0.0;
		switch (numero) {
		case 100:
			System.out.printf(" 100  - Cachorro Quente R$ 2,00 * %d UND ", quantidade);
			total = quantidade * 2.00;
			break;
		case 101:
			System.out.printf(" 101  - Bauru Simples   R$ 1,50 * %d UND ", quantidade);
			total = quantidade * 1.50;
			break;
		case 102:
			System.out.printf(" 102  - Bauru c/ Ovo    R$ 3,50 * %d UND ", quantidade);
			total = quantidade * 3.50;
			break;
		case 103:
			System.out.printf(" 103  - Hamburger       R$ 4,00 * %d UND ", quantidade);
			total = quantidade * 4.00;
			break;
		case 104:
			System.out.printf(" 104  - Cheeseburger    R$ 6,00 * %d UND ", quantidade);
			total = quantidade * 6.00;
			break;
		case 105:
			System.out.printf(" 105  - Refrigerante    R$ 5,00 * %d UND ", quantidade);
			total = quantidade * 5.00;
			break;
		}

		
		System.out.printf("Total: R$ %.2f", total);
		
		
		
		
		sc.close();
	}

}
