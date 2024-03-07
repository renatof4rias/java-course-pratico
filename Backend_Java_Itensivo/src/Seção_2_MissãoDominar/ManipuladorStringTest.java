package Seção_2_MissãoDominar;

public class ManipuladorStringTest {

	public static void main(String[] args) {

		ManipuladorString a1 = new ManipuladorString();
		ManipuladorString a2 = new ManipuladorString();
		
		a1.setTexto("TEXTO REFERENTE AO OBJETO A1 ");
		a2.setTexto("texto referente ao objeto a2 ");
		
		System.out.println(a1.concatenarTexto(a2));
		
	}

}