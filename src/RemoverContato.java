import java.util.HashMap;

class RemoverContato {
	public void removerContato(HashMap<String, String> contatos, String nome) throws ContatoInexistenteException{
		if(contatos.containsKey(nome)){
			contatos.remove(nome);
			System.out.println("Contato removido com sucesso!");
		}else{
			throw new ContatoInexistenteException("Contato inexistente!");
		}
	}
}
