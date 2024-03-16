package Seção_5_MissãoDominar;

public class ContaBancaria {
	
	private String numero;
	private double saldo;
	
	public ContaBancaria(String numero, double saldo){
		this.numero = numero; 
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}