package Laboratorio.Biblioteca;

public class BibliotecaTest {

	public static void main(String[] args) {

		Biblioteca b1 = new Biblioteca(10);
		
		b1.cadastrarLivro("Ansiedade 1", "Augusto Cury");
		b1.cadastrarLivro("Ansiedade 2", "Augusto Cury");
		b1.cadastrarLivro("Mind Set", "Augusto Cury");
		b1.cadastrarLivro("Pai Rico", "Augusto Cury");
		b1.cadastrarLivro("Pai Pobre", "Augusto Cury");
		b1.cadastrarLivro("Matematica 5 ano", "Augusto Cury");
		b1.cadastrarLivro("Matematica 6 ano", "Augusto Cury");
		b1.cadastrarLivro("Matematica 7 ano", "Augusto Cury");
		b1.cadastrarLivro("Matematica 8 ano", "Augusto Cury");
		System.out.println();
		
		b1.listarLivro();
		System.out.println();

		b1.emprestarLivro("Ansiedade 1");
		System.out.println();
		
		b1.listarLivro();
		System.out.println();
		
//		b1.devolverLivro("Ansiedade 1");
//		System.out.println();
		
//		b1.listarLivro();
//		System.out.println();
		
		b1.exibirInformacoesLivro("Ansiedade 1");
		
		
	}
	
	

}
