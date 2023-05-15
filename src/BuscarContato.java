import java.util.HashMap;

class BuscarContato {
	public void buscarContato(HashMap<String, String> contatos, String nome) throws ContatoInexistenteException{
		if(contatos.containsKey(nome)){
			System.out.println("Contato: " + nome + " - " + contatos.get(nome));
		}else{
			throw new ContatoInexistenteException("Contato inexistente!");
		}
	}
}
