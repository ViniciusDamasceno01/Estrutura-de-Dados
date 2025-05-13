package Q1;

import java.util.Scanner;
import java.util.Stack;

public class GerenciadorLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Stack<String> pilhaLivros = new Stack<>();
		int opcao;

		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1. Inserir livro na pilha");
			System.out.println("2. Consultar livro");
			System.out.println("3. Remover livro");
			System.out.println("4. Esvaziar pilha");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do livro: ");
				String livro = scanner.nextLine();
				pilhaLivros.push(livro);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("Pilha vazia!");
				} else {
					System.out.println("Livro no topo: " + pilhaLivros.peek());
				}
				break;
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("Pilha vazia!");
				} else {
					String livroRemovido = pilhaLivros.pop();
					System.out.println("Livro removido: " + livroRemovido);
				}
				break;
			case 4:
				pilhaLivros.clear();
				System.out.println("Pilha esvaziada!");
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != 5);

		scanner.close();
	}
}
