package Seção_4;

public class While {

	public static void main(String[] args) {

		// WHILE = ENQUANTO
		// ENQUANTO A CONDIÇÃO FOR VERDADEIRA EXECUTE O BLOCO DE COMANDO

		/*
		 * WHILE (CONDITION){
		 * 
		 * BLOCO DE COMANDO
		 * 
		 * }
		 * 
		 * 
		 * TESTA A CONDIÇÃO E DEPOIS EXECUTA
		 */

		int i = 0;

		while (i <= 10) {
			System.out.println(i * 8);
			i++;
		}

		// DO WHILE = FAÇA

		/*
		 * do {
		 * 
		 * BLOCO DE COMANDO
		 * 
		 * } while ();
		 * 
		 * 
		 * EXECUTA O BLOCO PRIMEIRO E DEPOIS TESTA A CONDIÇÃO
		 * 
		 */
		
		int j = 0;
		
		do {
			System.out.println(j * 8);
			j++;
		} while (j <= 10);

	}

}
