package Seção_2_MissãoDominar;

public class Vendedor extends Funcionario{

	@Override
	public double calcularSalario(double valorPorHora, int horasTrabalhadas) {
		return valorPorHora * horasTrabalhadas + 100.0;
	}

}