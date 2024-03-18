package Laboratorio.Vendas;

public class Usuario {

	private String usuario;
	private String senha;

	public Usuario() {

	}

	public Usuario(String senha, String usuario) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public String getSenha() {
		return this.senha;
	}

}