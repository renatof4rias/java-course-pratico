package Seção_2;

public class Aula_51_Lab {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Posso criar uma instacia 
		
		Aula_51 a1 = new Aula_51();
		
		// isso me permite acessar membros NAO STATIC
		// Mas nao há necessidade de uma instancia para acessar o STATIC
		
		Aula_51.nome = "a";
		Aula_51.metodoTeste();
		
		
	}

}
