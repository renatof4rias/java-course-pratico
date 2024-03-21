package Laboratorio.PetShop;

public class AnimalService {

	private AnimalRepository animalRepository = new AnimalRepository();

	public void cadastrarAnimal(String nomeTutor, String telefoneTutor, String nomePet, String especiePet,
			String observacoes) {
		animalRepository.cadastrarAnimal(nomeTutor, telefoneTutor, nomePet, especiePet, observacoes);
	}

	public void listarAnimais() {
		animalRepository.listarAnimais();
	}

	public void buscarAnimal(String nomeTutor, String nomePet) {
		animalRepository.buscarAnimal(nomeTutor, nomePet);
	}

	public void removerAnimal(String nomeTutor, String nomePet) {
		animalRepository.removerAnimal(nomeTutor, nomePet);
	}

}
