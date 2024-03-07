package Seção_2_MissãoDominar;

public class ManipuladorString {

	private String texto;
	
	public ManipuladorString() {
		
	}
	
	public ManipuladorString(String texto) {
		this.texto = texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public String concatenarTexto(ManipuladorString manipuladorString) {
		return this.texto + manipuladorString.texto;
	}
	
	
	
	
}
