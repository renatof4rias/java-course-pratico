package Laboratorio.Chat;

public class UsuarioRepository {

	 private Usuario[] usuariosLogados;
	    private Chat[] mensagens;
	    private int usuariosLogadosCount;
	    private int mensagensCount;

	    public UsuarioRepository() {
	        usuariosLogados = new Usuario[10];
	        mensagens = new Chat[100]; 
	        usuariosLogadosCount = 0;
	        mensagensCount = 0;
	    }

	    public void login(String nomeUsuario, String email) {
	        if (usuariosLogadosCount < 10) {
	            usuariosLogados[usuariosLogadosCount++] = new Usuario(nomeUsuario, email);
	            System.out.println("Login realizado com sucesso.");
	        } else {
	            System.out.println("Limite de usuários logados atingido.");
	        }
	    }

	    public void enviarMensagem(Usuario remetente, Usuario destinatario, String conteudo) {
	        mensagens[mensagensCount++] = new Chat(remetente, destinatario, conteudo);
	        System.out.println("Mensagem enviada com sucesso.");
	    }

	    public void exibirUsuariosLogados() {
	        System.out.println("Usuários logados:");
	        for (int i = 0; i < usuariosLogadosCount; i++) {
	            System.out.println(usuariosLogados[i].getNomeUsuario());
	        }
	    }
}