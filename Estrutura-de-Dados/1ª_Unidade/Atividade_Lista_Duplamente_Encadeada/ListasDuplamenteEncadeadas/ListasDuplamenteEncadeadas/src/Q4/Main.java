package Q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 15 números ímpares:");

		for (int i = 1; i <= 15; i++) {
			System.out.print("Número " + i + ": ");
			int numero = Integer.parseInt(sc.nextLine());
			lista.inserirFim(numero);
		}

		int opcao;
		do {
			// Exibição do menu
			System.out.println("\n--- Menu ---");
			System.out.println("1 - Inserir no início");
			System.out.println("2 - Inserir no fim");
			System.out.println("3 - Remover do início");
			System.out.println("4 - Remover do fim");
			System.out.println("5 - Listar todos");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = Integer.parseInt(sc.nextLine());

			// Processamento das opções do menu
			switch (opcao) {
			case 1:
				System.out.print("Digite o valor a inserir no início: ");
				int valorInicio = Integer.parseInt(sc.nextLine());
				lista.inserirInicio(valorInicio);
				break;
			case 2:
				System.out.print("Digite o valor a inserir no fim: ");
				int valorFim = Integer.parseInt(sc.nextLine());
				lista.inserirFim(valorFim);
				break;
			case 3:
				lista.removerInicio();
				break;
			case 4:
				lista.removerFim();
				break;
			case 5:
				lista.listar();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 0);

		sc.close();
	}
}