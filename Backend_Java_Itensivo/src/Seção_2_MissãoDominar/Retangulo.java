package Seção_2_MissãoDominar;

public class Retangulo {

	private Double largura;
	private Double altura;

	public Retangulo() {
		
	}
	
	public Retangulo(Double largura, Double altura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getLargura() {
		return this.largura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double getAltura() {
		return this.altura;
	}
	
	public Double calcularArea() {
		return this.altura * this.largura;
	}
	
}