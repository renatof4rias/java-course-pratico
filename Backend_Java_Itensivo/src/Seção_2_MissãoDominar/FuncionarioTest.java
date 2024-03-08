package Seção_2_MissãoDominar;

public class FuncionarioTest {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		Vendedor v1 = new Vendedor();
		
		System.out.println(g1.calcularSalario(100, 10));
		System.out.println(v1.calcularSalario(100, 10));
		
	}

}