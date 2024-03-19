package Laboratorio.Hospital;

public class HospitalTest {

	public static void main(String[] args) {

		SistemaHospital h1 = new SistemaHospital();

//		Paciente p1 = new Paciente("ABC", "01/01/0101", 'M', "Rua 01 Casa 01", "(01)0 1010-1010");

		h1.cadastrarPaciente("ABC", "01/01/0101", 'M', "Rua 01 Casa 01", "(01)0 1010-1010", "Tosse", "Aspirina",
				"Medicacao", "Observacao");
		h1.cadastrarPaciente("DEF", "01/01/0101", 'M', "Rua 01 Casa 01", "(01)0 1010-1010", "Tosse", "Aspirina",
				"Medicacao", "Observacao");
		h1.cadastrarPaciente("GHI", "01/01/0101", 'M', "Rua 01 Casa 01", "(01)0 1010-1010", "Tosse", "Aspirina",
				"Medicacao", "Observacao");
		h1.cadastrarPaciente("JKL", "01/01/0101", 'M', "Rua 01 Casa 01", "(01)0 1010-1010", "Tosse", "Aspirina",
				"Medicacao", "Observacao");

		h1.alterarDados("ABC", "Rua 02 Casa 02", "(02)0 2020-2020");
		// h1.listarTodosPaciente();

		// h1.alterarSituacaoPaciente("ANC", "Retorno");
		h1.alterarSituacaoPaciente("ABC", "Retorno");
		h1.listarPaciente("ABC");

	}

}
