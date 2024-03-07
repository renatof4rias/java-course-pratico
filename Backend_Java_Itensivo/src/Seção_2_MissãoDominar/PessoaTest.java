package Seção_2_MissãoDominar;

public class PessoaTest {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Rael");
		System.out.println(p1.informacoesPessoais());
		
		Pessoa p2 = new Pessoa("Chad", 57);
		System.out.println(p2.informacoesPessoais());

		Pessoa p3 = new Pessoa("Lucky", 16, Genero.MASCULINO);
		System.out.println(p3.informacoesPessoais());
		
	}

}