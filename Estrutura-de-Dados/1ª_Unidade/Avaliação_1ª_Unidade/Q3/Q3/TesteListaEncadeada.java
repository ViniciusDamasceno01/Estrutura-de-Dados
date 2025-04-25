package Q3;

import java.util.Scanner;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ListaEncadeada lista = new ListaEncadeada();

		int opcao;

		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1. Adicionar Musica");
			System.out.println("2. Verificar tamanho da lista");
			System.out.println("3. Verificar lista de musicas adicionadas");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome da musica: ");
				String nome = sc.nextLine();
				lista.Adicionar(nome);
				break;

			case 2:
				System.out.println("Tamanho da lista: " + lista.TamanhoLista());
				break;

			case 3:
				System.out.print("Listas de musicas até o momento: ");
				lista.listar();
				break;

			case 0:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida.");
				break;
			}

		} while (opcao != 0);
	}
}
