package Q4;

import java.util.Scanner;

public class TesteMatriculaRecursividade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListaMatriculaRecursividade lista = new ListaMatriculaRecursividade();

		int opcao;

		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1. Adicionar Aluno");
			System.out.println("2. Listar Alunos");
			System.out.println("3. Buscar Aluno");
			System.out.println("0. Sair");
			System.out.print("Opção: ");
			opcao = sc.nextInt();
			sc.nextLine(); // limpa o buffer

			switch (opcao) {
			case 1:
				System.out.print("Nome do aluno: ");
				String nome = sc.nextLine(); 
				lista.Adicionar(nome);
				break;
			case 2:
				lista.listar();
				break;
			case 3:
				System.out.print("Nome para buscar: ");
				String nomeBusca = sc.nextLine();
				lista.buscarRecursiva(nomeBusca);
				break;
			case 0:
				System.out.println("Encerrando...");
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);
	}
}