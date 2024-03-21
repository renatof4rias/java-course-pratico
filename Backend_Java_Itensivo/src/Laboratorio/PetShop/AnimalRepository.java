package Laboratorio.PetShop;

public class AnimalRepository {

	private Animal[] animais;

	public AnimalRepository() {
		this.animais = new Animal[100];
	}

	public void cadastrarAnimal(String nomeTutor, String telefoneTutor, String nomePet, String especiePet,
			String observacoes) {
		for (int i = 0; i < animais.length; i++) {
			if (animais[i] == null) {
				animais[i] = new Animal(nomeTutor, telefoneTutor, nomePet, especiePet, observacoes);
				System.out.println("Pet Cadastrado com Sucesso .");
				return;
			}
		}
		System.out.println("Erro ao Cadastrar .");
	}

	public void buscarAnimal(String nomeTutor, String nomePet) {
		for (int i = 0; i < animais.length; i++) {
			if (animais[i] != null && animais[i].getNomePet().equals(nomePet)
					&& animais[i].getNomeTutor().equals(nomeTutor)) {
				System.out.println(animais[i].toString());
				return;
			}
		}
		System.out.println("Pet Nao Encontrado .");
	}

	public void listarAnimais() {
		System.out.println("Lista de Pets Cadastrados no Sistema .");
		for (int i = 0; i < animais.length; i++) {
			if (animais[i] != null) {
				System.out.println(animais[i].getNomePet());
			}
		}
	}

	public void removerAnimal(String nomeTutor, String nomePet) {
		for (int i = 0; i < animais.length; i++) {
			if (animais[i] != null && animais[i].getNomePet().equals(nomePet)
					&& animais[i].getNomeTutor().equals(nomeTutor)) {
				animais[i] = null;
				System.out.println("Cadastro Removido .");
				return;
			}
		}
		System.out.println("Pet Nao Encontrado .");
	}

}