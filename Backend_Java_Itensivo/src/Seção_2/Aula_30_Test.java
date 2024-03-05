package Seção_2;

public class Aula_30_Test {

	public static void main(String[] args) {

		Aula_30 a1 = new Aula_30("1231231323", "asdfghh");
		a1.setCpf("a");
		System.out.println(a1.getCpf());

		a1.setNome("a");
		System.out.println(a1.getNome());

		System.out.println(a1);

		Aula_30_Record aa = new Aula_30_Record("1231231323", "asdfghh");
		System.out.println(aa.cpf());
		System.out.println(aa.nome());

		Integer c = 10;

		int a = c;
		Integer b = a;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

//		b.valueOf(a); 
	}

}