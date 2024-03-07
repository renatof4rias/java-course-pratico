package Seção_2_MissãoDominar;

public class Aluno {
	private static int MATRICULA = 1; 
	
	private String nome;
	private int matriculaAluno;
	
	public Aluno() {
	
	}
	
	public Aluno(String nome) {
		this.setNome(nome);
		this.gerarMatricula();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	
	private void gerarMatricula() {
		this.setMatriculaAluno(MATRICULA);
		MATRICULA++;
	}
	
	public String informacoesAluno() {
		return String.format
				("""
				Aluno: %s
				Matricula: %d
				""", this.nome, this.matriculaAluno);
	}
	
}