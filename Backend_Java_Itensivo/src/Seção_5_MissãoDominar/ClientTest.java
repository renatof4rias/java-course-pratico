package Seção_5_MissãoDominar;

public class ClientTest {

	public static void main(String[] args) {

		Client[] c1 = {
			new Client("Minerva", "0102030405"),
			new Client("Revolta", "8475629341"),
			new Client("Play", "5123094524"),
		};
		
		
		String cpf = "8475629341";
		
		String nome = "";
		for (Client client : c1) {

			if (client.getCpf().equals(cpf)) {
				nome = client.getNome();
			} 
			
		}

		if (nome.equals("")) {
			System.out.println("Cliente Nao encontrado");
		} else {
			System.out.println("Cliente Encontrado -> " + nome);
		}
		
	}
}