import java.util.List;
import java.util.logging.Logger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws ContatoInexistenteException {
		Logger log = Logger.getAnonymousLogger();
		GerenciadorDeContatos gerenciador = new GerenciadorDeContatos();

		while (true) {
			System.out.println("Selecione uma opção: ");
			System.out.println("1. Adicionar contato");
			System.out.println("2. Remover contato");
			System.out.println("3. Listar contatos");
			System.out.println("4. Buscar contato");
			System.out.println("0. Sair");

			Scanner scanner = new Scanner(System.in);
			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
				case 1:
					System.out.println("Digite o nome do contato: ");
					String nome = scanner.nextLine();
					System.out.println("Digite o telefone do contato: ");
					String telefone = scanner.nextLine();
					gerenciador.getAdicionarContato().adicionarContato(gerenciador.getContatos(), nome, telefone);
					break;
				case 2:
					System.out.println("Digite o nome do contato: ");
					String nomeRemover = scanner.nextLine();
					gerenciador.getRemoverContato().removerContato(gerenciador.getContatos(), nomeRemover);
					break;
				case 3:
					gerenciador.getListarContato().listarContato(gerenciador.getContatos());
					break;
				case 4:
					System.out.println("Digite o nome do contato: ");
					String nomeBuscar = scanner.nextLine();
					gerenciador.getBuscarContato().buscarContato(gerenciador.getContatos(), nomeBuscar);
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		}
	}
}
