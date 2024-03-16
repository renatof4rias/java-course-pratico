package Seção_5_MissãoDominar;

public class CarroTest {

	public static void main(String[] args) {

		Carro[] c1 = {
			new Carro("Fiat", "Uno", 2012),
			new Carro("Volkswagen", "Gol", 2019),
			new Carro("Ford", "Fusion", 2016),
			new Carro("Renault", "Kwid", 2021),
			new Carro("Mercedes", "G-63", 2023),
			new Carro("BMW", "380i", 2020),
			new Carro("Porsche", "911", 2024),
		};
		
		int ano = 9999;
		String carroAntigo = "";
		
		for (Carro carro : c1) {
			if (carro.getAno() < ano) {
				ano = carro.getAno();
				carroAntigo = carro.getModelo();
			}
		}

		System.out.println("Carro mais antigo da lista: " + carroAntigo + " " + ano);
		
		
	}

}
