package Laboratorio.Chat;

public class Usuario {

	private String nomeUsuario;
	private String email;

	public Usuario(String nomeUsuario, String email) {
		this.nomeUsuario = nomeUsuario;
		this.email = email;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public String getEmail() {
		return email;
	}

}