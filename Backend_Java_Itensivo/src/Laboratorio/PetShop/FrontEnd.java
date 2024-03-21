package Laboratorio.PetShop;

public class FrontEnd {
	public static void main(String[] args) {
		AnimalService a2 = new AnimalService();

		a2.cadastrarAnimal("Renato", "1111111123", "Snow", "ABAC", "N");
		a2.cadastrarAnimal("Renato", "1111111123", "Apolo", "ABAC", "N");
		a2.cadastrarAnimal("Renato", "1111111123", "Negão", "ABAC", "N");
		a2.cadastrarAnimal("Renato", "1111111123", "Pantera", "ABAC", "N");

		a2.listarAnimais();
		a2.buscarAnimal("Renato", "Negão");

		a2.removerAnimal("Renato", "Snow");
		a2.listarAnimais();

	}
}