package Seção_3;

public class Encadeada {
	public static void main(String[] args) {

		// ESTRUTURA CONDICIONAL ENCADEADA  
		
		double mediaFinal = 6.5;
		
		if (mediaFinal >= 7.0) {
			System.out.println("APROVADO");
		} else if (mediaFinal < 7.0 && mediaFinal >= 5.0){
			System.out.println("RECUPERACAO");
		} else if (mediaFinal < 5.0){
			System.out.println("REPROVADO");
		} 		

	
	}
}