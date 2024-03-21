package Laboratorio.PetShop;

public class Animal {

	private String nomeTutor;
	private String telefoneTutor;
	private String nomePet;
	private String especiePet;
	private String observacoes;

	public Animal(String nomeTutor, String telefoneTutor, String nomePet, String especiePet, String observacoes) {
		this.nomeTutor = nomeTutor;
		this.telefoneTutor = telefoneTutor;
		this.nomePet = nomePet;
		this.especiePet = especiePet;
		this.observacoes = observacoes;
	}

	public String getNomeTutor() {
		return nomeTutor;
	}

	public void setNomeTutor(String nomeTutor) {
		this.nomeTutor = nomeTutor;
	}

	public String getTelefoneTutor() {
		return telefoneTutor;
	}

	public void setTelefoneTutor(String telefoneTutor) {
		this.telefoneTutor = telefoneTutor;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public String getEspeciePet() {
		return especiePet;
	}

	public void setEspeciePet(String especiePet) {
		this.especiePet = especiePet;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	@Override
	public String toString() {
		return "Animal [nomeTutor=" + nomeTutor + ", telefoneTutor=" + telefoneTutor + ", nomePet=" + nomePet
				+ ", especiePet=" + especiePet + ", observacoes=" + observacoes + "]";
	}
}