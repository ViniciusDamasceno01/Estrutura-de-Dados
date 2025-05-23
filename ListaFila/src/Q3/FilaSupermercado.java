package Q3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaSupermercado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Queue<Cliente> filaClientes = new LinkedList<>();
		int opcao;

		do {
			System.out.println("\n--- FILA DO SUPERMERCADO ---");
			System.out.println("1 - Inserir cliente");
			System.out.println("2 - Remover cliente (atendido)");
			System.out.println("3 - Consultar quantidade de clientes na fila");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente: ");
				String nome = scanner.nextLine();
				filaClientes.add(new Cliente(nome));
				System.out.println("Cliente adicionado à fila.");
				break;

			case 2:
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					Cliente atendido = filaClientes.poll();
					System.out.println("Cliente atendido e removido da fila: " + atendido);
				}
				break;

			case 3:
				System.out.println("Total de clientes na fila: " + filaClientes.size());
				break;

			case 4:
				System.out.println("Encerrando o sistema...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 4);

		scanner.close();
	}
}
