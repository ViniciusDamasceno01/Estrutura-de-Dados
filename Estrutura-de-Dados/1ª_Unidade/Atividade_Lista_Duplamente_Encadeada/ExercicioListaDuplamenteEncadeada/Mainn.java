package Atividade;

import java.util.Scanner;

public class Mainn {
	public static void main(String[] args) {

		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

		Scanner sc = new Scanner(System.in);

		int opcao;
		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1 - Inserir à esquerda (vários)");
			System.out.println("2 - Inserir à direita (vários)");
			System.out.println("3 - Remover da esquerda");
			System.out.println("4 - Remover da direita");
			System.out.println("5 - Listar da esquerda para a direita");
			System.out.println("6 - Listar da direita para a esquerda");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				char continuarEsq;
				do {
					System.out.print("Digite um valor para inserir à esquerda: ");
					int valorEsq = sc.nextInt();
					lista.inserirListaEsquerda(valorEsq);

					System.out.print("Deseja inserir outro valor à esquerda? (S/N): ");
					continuarEsq = sc.next().toUpperCase().charAt(0);
				} while (continuarEsq == 'S');
				break;

			case 2:
				char continuarDir;
				do {
					System.out.print("Digite um valor para inserir à direita: ");
					int valorDir = sc.nextInt();
					lista.inserirListaDireita(valorDir);

					System.out.print("Deseja inserir outro valor à direita? (S/N): ");
					continuarDir = sc.next().toUpperCase().charAt(0);
				} while (continuarDir == 'S');
				break;

			case 3:
				int removidoEsq = lista.removerListaEsquerda();
				if (removidoEsq == 0) {
					System.out.println("A lista está vazia. Nenhum valor foi removido.");
				} else {
					System.out.println("Valor removido da esquerda: " + removidoEsq);
				}
				break;

			case 4:
				int removidoDir = lista.removerListaDireita();
				if (removidoDir == 0) {
					System.out.println("A lista está vazia. Nenhum valor foi removido.");
				} else {
					System.out.println("Valor removido da direita: " + removidoDir);
				}
				break;

			case 5:
				lista.listarListaImprimir();
				break;

			case 6:
				lista.listarListaReversa();
				break;

			case 0:
				System.out.println("Programa finalizado.");
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (opcao != 0);

		sc.close();
	}
}