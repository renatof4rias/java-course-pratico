package Seção_5_MissãoDominar;

public class PessoaTest {

	public static void main(String[] args) {

		Pessoa[] p1 = { new Pessoa("Lucas", 19), new Pessoa("Livia", 29), new Pessoa("Lucio", 39),
				new Pessoa("Lurdes", 49), new Pessoa("Luiz", 59), };

		for (Pessoa pessoa : p1) {
			System.out.println("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade());
		}

	}

}
