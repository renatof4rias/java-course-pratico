package Seção_5_MissãoDominar;

public class ContaBancariaTest {

	public static void main(String[] args) {

		ContaBancaria[] c1 = {
				new ContaBancaria("12345", 1234.0),
				new ContaBancaria("67891", 5678.0),
				new ContaBancaria("10923", 9010.0),
		};
		
		double maiorSaldo = 0.0;
		String conta = " ";
		for (ContaBancaria contaBancaria : c1) {
			if (contaBancaria.getSaldo() > maiorSaldo) {
				maiorSaldo = contaBancaria.getSaldo(); 
				conta = contaBancaria.getNumero();
			}
		}
		
		System.out.println("Conta com Maior Saldo: " + conta + " R$ " + maiorSaldo );
		
	}
}