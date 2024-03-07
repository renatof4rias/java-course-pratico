package Seção_2_MissãoDominar;

public class Carro {

	private String marca;
	private String modelo;
	private int ano;
	
	public Carro() {
		
	}
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return this.ano;
	}
		
	public String exibirInformacoes() {
		return String.format("""
				Marca:  %s
				Modelo: %s 
				Ano: %d
				""", this.marca, this.modelo, this.ano);
	}
	
}