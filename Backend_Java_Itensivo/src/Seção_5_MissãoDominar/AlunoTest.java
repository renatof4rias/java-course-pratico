package Seção_5_MissãoDominar;

public class AlunoTest {

	public static void main(String[] args) {

		Aluno[] a1 = { new Aluno("Lucas", new double[] { 10.0, 10.0, 10.0 }),
				new Aluno("Girimias", new double[] { 10.0, 10.0, 10.0 }),
				new Aluno("Trevor", new double[] { 10.0, 10.0, 10.0 }),
				new Aluno("Luthie", new double[] { 10.0, 10.0, 10.0 }),
				new Aluno("Fury", new double[] { 10.0, 10.0, 10.0 }), };

		for (Aluno aluno : a1) {
			double media = aluno.calcularMedia();
			System.out.println("Aluno: " + aluno.getNome() + " Media: " + media);
		}

	}

}
