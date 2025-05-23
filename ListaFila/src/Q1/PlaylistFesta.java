package Q1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PlaylistFesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Queue<String> playlist = new LinkedList<>();
		int opcao;

		do {
			System.out.println("\n--- MENU PLAYLIST DA FESTA ---");
			System.out.println("1 - Inserir música");
			System.out.println("2 - Consultar próxima música");
			System.out.println("3 - Remover música (tocar música)");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome da música: ");
				String musica = scanner.nextLine();
				playlist.add(musica);
				System.out.println("Música adicionada à playlist!");
				break;

			case 2:
				if (playlist.isEmpty()) {
					System.out.println("A playlist está vazia.");
				} else {
					System.out.println("Próxima música: " + playlist.peek());
				}
				break;

			case 3:
				if (playlist.isEmpty()) {
					System.out.println("A playlist está vazia. Nenhuma música para remover.");
				} else {
					System.out.println("Tocando e removendo: " + playlist.poll());
				}
				break;

			case 4:
				System.out.println("Encerrando o programa...");
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (opcao != 4);

		scanner.close();
	}

}
