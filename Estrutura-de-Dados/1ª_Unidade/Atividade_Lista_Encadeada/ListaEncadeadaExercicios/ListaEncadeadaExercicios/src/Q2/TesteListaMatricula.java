package Q2;

import java.util.Scanner;

public class TesteListaMatricula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ListaMatricula lista = new ListaMatricula();

		int opcao;

		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1 - Adicionar aluno");
			System.out.println("2 - Remover aluno do início");
			System.out.println("3 - Remover aluno do meio");
			System.out.println("4 - Remover aluno do final");
			System.out.println("5 - Pesquisar aluno");
			System.out.println("6 - Listar alunos");
			System.out.println("7 - Ordenar por nome (A-Z)");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Nome do aluno: ");
				String nome = sc.nextLine();
				lista.Adicionar(nome);
				break;

			case 2:
				lista.RemoverInicio();
				break;

			case 3:
				lista.RemoverDoMeio();
				break;

			case 4:
				lista.RemoverUltimo();
				break;

			case 5:
				System.out.print("Digite o nome do aluno a pesquisar: ");
				String nomeBusca = sc.nextLine();
				lista.pesquisar(nomeBusca);
				break;

			case 6:
				lista.listar();
				break;

			case 7:
				lista.ordenarAlfabeticamente();
				System.out.println("Lista ordenada com sucesso.");
				break;

			case 0:
				System.out.println("Encerrando programa...");
				break;

			default:
				System.out.println("Opção inválida.");
				break;
			}

		} while (opcao != 0);
	}
}
