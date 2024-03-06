package Seção_2;

public class Aula_68_Lab {

	public static void main(String[] args) {

		Aula_68_Pessoa p1 = new Aula_68_Pessoa("Joanas", 25, 1.79, 79.0, 0.0);
		Aula_68 p2 = new Aula_68();
		
		
		System.out.print("Antes do metodo: ");
		System.out.println(p1.basal);

		System.out.print("Depois do metodo: ");
		System.out.println(p2.calculoBasal(p1));
		
	
		System.out.print("Antes do metodo: ");
		System.out.println(p1.basal);
	
		
	}
}