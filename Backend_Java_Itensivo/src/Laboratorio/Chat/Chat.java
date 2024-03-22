package Laboratorio.Chat;

public class Chat {

	private Usuario remetente;
	private Usuario destinatario;
	private String conteudo;

	public Chat(Usuario remetente2, Usuario destinatario2, String conteudo) {
		this.remetente = remetente2;
		this.destinatario = destinatario2;
		this.conteudo = conteudo;
	}

	public Usuario getRemetente() {
		return remetente;
	}

	public void setRemetente(Usuario remetente) {
		this.remetente = remetente;
	}

	public Usuario getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Usuario destinatario) {
		this.destinatario = destinatario;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}