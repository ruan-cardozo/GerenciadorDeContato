import java.util.HashMap;

public class ListarContato {
	public void listarContato(HashMap<String, String> contatos){
		for (HashMap.Entry<String, String> entry : contatos.entrySet()) {
			System.out.println("Contato: " + entry.getKey() + " - " + entry.getValue());
		}
	}
}
