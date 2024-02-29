package Seção_1;

import java.util.Scanner;

public class MissaoDominar_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o Valor da Compra: ");
		double a = sc.nextDouble();

		System.out.print("Digite o Valor do Pagamento: ");
		double b = sc.nextDouble();
		
		double troco = 0.0;
		
		if (b > a) {
			troco = b - a;
			System.out.println("Valor do Troco: R$ " + troco);	
		} else if(a > b) {
			troco = a - b;
			System.out.println("Valor Insuficiente faltam: R$ " + Math.abs(troco));	
		}
		
		sc.close();
	}

}
