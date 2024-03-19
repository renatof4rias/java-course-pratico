package Laboratorio.Hospital;

public class Consulta {

	private Paciente paciente;
	private String sintomas;
	private String medicamento;
	private String procedimentos;
	private String situacao;

	public Consulta(Paciente paciente, String sintomas, String medicamentos, String procedimentos, String situacao) {
		this.paciente = paciente;
		this.sintomas = sintomas;
		this.medicamento = medicamentos;
		this.procedimentos = procedimentos;
		this.situacao = situacao;
	}

	public String getSintomas() {
		return sintomas;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public String getProcedimentos() {
		return procedimentos;
	}

	public String getSituacao() {
		return situacao;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Consulta [paciente=" + paciente.toString() + ", sintomas=" + sintomas + ", medicamento=" + medicamento
				+ ", procedimentos=" + procedimentos + ", situacao=" + situacao + "]";
	}

}