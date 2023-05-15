import java.util.HashMap;

class AdicionarContato {
	public void adicionarContato(HashMap<String, String> contatos, String nome, String numeroTelefone){
		contatos.put(nome, numeroTelefone);
		System.out.println("Contato adicionado com sucesso!");
	}
}
