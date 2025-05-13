package Q3;

import java.util.Scanner;
import java.util.Stack;

public class GerenciadorTarefas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> pilhaTarefas = new Stack<>();
		int opcao;

		do {
			System.out.println("\n--- MENU DE TAREFAS ---");
			System.out.println("1. Adicionar tarefa");
			System.out.println("2. VER próxima tarefa");
			System.out.println("3. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite a tarefa: ");
				String tarefa = scanner.nextLine();
				pilhaTarefas.push(tarefa);
				System.out.println("✓ Tarefa adicionada: \"" + tarefa + "\"");
				break;
			case 2:
				if (pilhaTarefas.isEmpty()) {
					System.out.println("✓ Nenhuma tarefa pendente! :)");
				} else {
					String proximaTarefa = pilhaTarefas.peek(); // Só olha, não remove!
					System.out.println("✓ Próxima tarefa: \"" + proximaTarefa + "\"");
				}
				break;
			case 3:
				System.out.println("✓ Saindo... Até logo!");
				break;
			default:
				System.out.println("✗ Opção inválida. Tente 1, 2 ou 3!");
			}
		} while (opcao != 3);

		scanner.close();
	}
}
