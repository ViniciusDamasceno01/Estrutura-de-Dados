package Q4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FilaSalaDeAula {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Aluno> filaOrdenada = new LinkedList<>();
		int opcao;

		do {
			System.out.println("\n--- FILA DA SALA DE AULA (ordenada por idade) ---");
			System.out.println("1 - Inserir aluno");
			System.out.println("2 - Consultar alunos");
			System.out.println("3 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); 

			switch (opcao) {
			case 1:
				System.out.print("Nome do aluno: ");
				String nome = scanner.nextLine();
				System.out.print("Idade do aluno: ");
				int idade = scanner.nextInt();
				scanner.nextLine(); 

				Aluno novoAluno = new Aluno(nome, idade);
				inserirOrdenado(filaOrdenada, novoAluno);
				System.out.println("Aluno inserido na fila.");
				break;

			case 2:
				if (filaOrdenada.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Alunos na fila (ordenados por idade):");
					for (Aluno aluno : filaOrdenada) {
						System.out.println(aluno);
					}
				}
				break;

			case 3:
				System.out.println("Encerrando o sistema...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 3);

		scanner.close();
	}

	public static void inserirOrdenado(List<Aluno> lista, Aluno novo) {
		int pos = 0;
		while (pos < lista.size() && lista.get(pos).getIdade() <= novo.getIdade()) {
			pos++;
		}
		lista.add(pos, novo);
	}

}
