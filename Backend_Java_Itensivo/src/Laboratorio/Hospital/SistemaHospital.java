package Laboratorio.Hospital;

public class SistemaHospital {

	private Consulta[] consultas;

	public SistemaHospital() {
		this.consultas = new Consulta[100];
	}

	public void cadastrarPaciente(String nome, String dataNascimento, char sexo, String endereco, String numeroTelefone,
			String sintomas, String medicamentos, String procedimentos, String situacao) {
		for (int i = 0; i < consultas.length; i++) {
			if (consultas[i] == null) {
				consultas[i] = new Consulta(new Paciente(nome, dataNascimento, sexo, endereco, numeroTelefone),
						sintomas, medicamentos, procedimentos, situacao);
				System.out.println("Paciente Cadastrado .");
				return;
			}
		}
		System.out.println("Erro Ao Cadastrar .");
	}

	public void alterarDados(String nomePaciente, String endereco, String numeroTelefone) {
		for (int i = 0; i < consultas.length; i++) {
			if (consultas[i] != null && consultas[i].getPaciente().getNome().equals(nomePaciente)) {
				consultas[i].getPaciente().setEndereco(endereco);
				consultas[i].getPaciente().setNumeroTelefone(numeroTelefone);
				System.out.println("Dados Alterado .");
				return;
			}
			System.out.println("Paciente Nao Encontrado .");
		}
	}

	public void listarTodosPaciente() {
		for (int i = 0; i < consultas.length; i++) {
			if (consultas[i] != null) {
				System.out.println(consultas[i]);
			}
		}
	}

	public void listarPaciente(String nomePaciente) {
		for (int i = 0; i < consultas.length; i++) {
			if (consultas[i] != null && consultas[i].getPaciente().getNome().equals(nomePaciente)) {
				System.out.println(consultas[i]);
				return;
			}
		}
	}

	public void alterarSituacaoPaciente(String nomePaciente, String situacao) {
		for (int i = 0; i < consultas.length; i++) {
			if (consultas[i] != null && consultas[i].getPaciente().getNome().equals(nomePaciente)) {
				consultas[i].setSituacao(situacao);
				System.out.println("Situação Atualizada .");
				return;
			}
		}
		System.out.println("Paciente Nao Encontrado .");
	}
}
