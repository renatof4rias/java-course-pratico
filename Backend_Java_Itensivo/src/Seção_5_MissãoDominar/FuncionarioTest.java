package Seção_5_MissãoDominar;

public class FuncionarioTest {

	public static void main(String[] args) {

		Funcionario[] f1 = {
				new Funcionario("AAA", 10.0),
				new Funcionario("BBB", 20.0),
				new Funcionario("CCC", 30.0),
				new Funcionario("DDD", 40.0),
				new Funcionario("EEE", 50.0)
		};
		
		double salario = 0.0;
		String nome = "";
		for (Funcionario funcionario : f1) {
			
			if (funcionario.getSalario() > salario) {
				salario = funcionario.getSalario();
				nome =funcionario.getNome();
			}
		}
		
		
		System.out.println("Maior Salario é " + nome +" R$ "+ salario);
		
	}

}
