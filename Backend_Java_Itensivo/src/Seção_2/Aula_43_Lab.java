package Seção_2;

public class Aula_43_Lab {

	// Variaveis de INSTANCIAS
	public String nome;
	public int x;
	public int z;

	// Funciona quando a classe é instanciada

	@SuppressWarnings("unused")
	public void VariaveisLocais(int a, int b) {
		// Variaveis Locais
		int x = a;
		int z = b; // ESTOU "SOBRESCREVENDO OS ATRIBUTOS = SOMBREAMENTO"
		System.out.println(x);
		// Funciona apenas quando o metodo é chamado
	}

}
