package Laboratorio.Chat;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UsuarioRepository salaChat = new UsuarioRepository();
		String opcao;

		do {
			System.out.println("1. Login");
			System.out.println("2. Enviar Mensagem");
			System.out.println("3. Exibir Usuários Logados");
			System.out.println("4. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextLine();

			switch (opcao) {
			case "1":
				System.out.print("Nome de usuário: ");
				String nomeUsuario = scanner.nextLine();
				System.out.print("Email: ");
				String email = scanner.nextLine();
				salaChat.login(nomeUsuario, email);
				break;
			case "2":
				System.out.print("Remetente: ");
				String remetente = scanner.nextLine();
				System.out.print("Destinatário: ");
				String destinatario = scanner.nextLine();
				System.out.print("Mensagem: ");
				String mensagem = scanner.nextLine();
				salaChat.enviarMensagem(new Usuario(remetente, ""), new Usuario(destinatario, ""), mensagem);
				break;
			case "3":
				salaChat.exibirUsuariosLogados();
				break;
			case "4":
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		} while (!opcao.equals("4"));

		scanner.close();
	}

}