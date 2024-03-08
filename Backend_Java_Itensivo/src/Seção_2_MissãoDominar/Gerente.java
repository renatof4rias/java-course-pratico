package Seção_2_MissãoDominar;

public class Gerente extends Funcionario{

	@Override
	public double calcularSalario(double valorPorHora, int horasTrabalhadas) {
		return valorPorHora * horasTrabalhadas + 400.0;
	}

}