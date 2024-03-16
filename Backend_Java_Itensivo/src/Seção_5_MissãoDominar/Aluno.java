package Seção_5_MissãoDominar;

public class Aluno {

	private String nome;
	private double[] nota;
	
    public Aluno(String nome, double[] nota) {
    	this.nome = nome;
    	this.nota = nota;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNota() {
		return nota;
	}

	public double calcularMedia() {
		double soma = 0.0;
		
		for (double not : nota) {
			soma += not;
		}
		
		return soma / nota.length;
	}

}