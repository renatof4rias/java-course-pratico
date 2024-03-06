package Seção_2;
public class Aula_58 {

	private String nome;
	private int idade;
	private double altura;
	
	// Metodos
	// Executa uma Tarefa 
	public void impressora() {
		
		// public = modificador de acesso 
		// void = tipo de retorno
		// impressora = identificador
		// () parametros
		
		 /*
		 MODIFICADOR PODE SER QUAL QUER UM DEPENDENDO DA NECESSIDADE
		 RETORNO DEPENDE DO TIPO DE DADO QUE VOCE TRABALHA SE FOR TRABALHAR COM STRING RETORNO É STRING, DOUBLE DOUBLE , INT INT OU RETORNAR NADA VOID
		 IMPRESSORA É UM IDENTIFICADOR ESCOLHIDO PELO PROGRAMADOR, POR CONVENSAO INICIA COM LOWERCASE E CAMELCASE aaaaaBbbbbb  E NOME SUGESTIVOS 
		 PARAMETROS SAO OPCIONAIS SUA FUNCAO É RECEBER VALORES DE FORA DA CLASSE PARA REALIZAR UMA TAREFA 
		 */
	}
	
	public String identidade() {
		return "O " + nome + " com seus " + altura + " metros de altura ao seus " + idade + " anos de idade"; 
	}

	public double multiplicacao(double a, double b) {
		return a * b;
	}
	
	
	
	
}  