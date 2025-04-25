package Q1;

import java.util.Scanner;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ListaEncadeada lista = new ListaEncadeada();

		int opcao;

		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1 - Adicionar professor");
			System.out.println("2 - Remover do início");
			System.out.println("3 - Remover do meio");
			System.out.println("4 - Remover do final");
			System.out.println("5 - Verificar tamanho da lista");
			System.out.println("6 - Verificar se a lista está vazia");
			System.out.println("7 - Apagar toda a lista");
			System.out.println("8 - Listar professores");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
	

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do professor: ");
				String nome = sc.nextLine();
				lista.Adicionar(nome);
				break;
			case 2:
				lista.RemoverInicio();
				break;
			case 3:
				System.out.print("Digite o nome do professor a ser removido (meio): ");
				String nomeMeio = sc.nextLine();
				lista.removerDoMeio(nomeMeio);
				break;
			case 4:
				lista.removerUltimo();
				break;
			case 5:
				System.out.println("Tamanho da lista: " + lista.TamanhoLista());
				break;
			case 6:
				System.out.println("Lista vazia? " + lista.estaVazia());
				break;
			case 7:
				lista.apagarLista();
				break;
			case 8:
				lista.listar();
				break;
			case 0:
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}

		} while (opcao != 0);
	}
}