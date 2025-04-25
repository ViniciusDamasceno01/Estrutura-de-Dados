package Q3;

import java.util.Scanner;

public class TesteListaEncadeadaQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ListaEncadeada lista = new ListaEncadeada();
		int numero;

		System.out.println("Informe 10 números inteiros e positivos:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numero = scanner.nextInt();

			if (numero > 0) {
				if (numero % 2 == 0) {
					lista.inserirFinal(numero);
					System.out.println("Número " + numero + " adicionado à lista.");
				} else {
					System.out.println("Número ímpar ignorado.");
				}
			} else {
				System.out.println("Erro: Apenas números positivos são permitidos!");
				i--;
			}
		}

		int opcao;
		do {
			System.out.println("\n====== MENU ======");
			System.out.println("1 - Remover do final");
			System.out.println("2 - Listar elementos");
			System.out.println("3 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				lista.removerFinal();
				System.out.println("Último número removido.");
				break;

			case 2:
				System.out.println("Números armazenados na lista:");
				lista.listarElementos();
				break;

			case 3:
				System.out.println("Saindo do programa...");
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 3);

	}
}