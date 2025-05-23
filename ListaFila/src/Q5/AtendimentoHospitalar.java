package Q5;

import java.util.Scanner;
import java.util.Stack;

public class AtendimentoHospitalar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Stack<Paciente> pilhaPacientes = new Stack<>();
		int opcao;

		do {
			System.out.println("\n--- ATENDIMENTO HOSPITALAR (PILHA) ---");
			System.out.println("1 - Inserir paciente");
			System.out.println("2 - Atender paciente");
			System.out.println("3 - Verificar se há paciente");
			System.out.println("4 - Indicar próximo paciente");
			System.out.println("5 - Quantidade de pacientes na fila");
			System.out.println("6 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); 

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do paciente: ");
				String nome = scanner.nextLine();
				pilhaPacientes.push(new Paciente(nome));
				System.out.println("Paciente inserido na pilha.");
				break;

			case 2:
				if (pilhaPacientes.isEmpty()) {
					System.out.println("Nenhum paciente para atender.");
				} else {
					Paciente atendido = pilhaPacientes.pop();
					System.out.println("Paciente atendido: " + atendido);
				}
				break;

			case 3:
				if (pilhaPacientes.isEmpty()) {
					System.out.println("Não há pacientes aguardando.");
				} else {
					System.out.println("Há pacientes aguardando atendimento.");
				}
				break;

			case 4:
				if (pilhaPacientes.isEmpty()) {
					System.out.println("Não há paciente para indicar.");
				} else {
					System.out.println("Próximo paciente a ser atendido: " + pilhaPacientes.peek());
				}
				break;

			case 5:
				System.out.println("Quantidade de pacientes aguardando: " + pilhaPacientes.size());
				break;

			case 6:
				System.out.println("Encerrando o sistema...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 6);

		scanner.close();
	}

}
