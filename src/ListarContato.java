import java.util.Map;
public class ListarContato {
	public void listarContato(Map<String, String> contatos){
		for (Map.Entry<String, String> entry : contatos.entrySet()) {
			System.out.println("Contato: " + entry.getKey() + " - " + entry.getValue());
		}
	}
}
