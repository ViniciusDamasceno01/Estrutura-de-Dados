package Q3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

		System.out.println("Cadastre 5 alunos:");
		for (int i = 1; i <= 5; i++) {
			System.out.print("Nome do aluno " + i + ": ");
			String nome = sc.nextLine().trim();
			System.out.print("Idade do aluno " + i + ": ");
			int idade = Integer.parseInt(sc.nextLine().trim());
			lista.inserirFim(new Aluno(nome, idade));
		}

		System.out.println("\nCadastro de mais 2 alunos:");
		System.out.print("Nome do aluno para o INÍCIO da lista: ");
		String nomeInicio = sc.nextLine().trim();
		System.out.print("Idade: ");
		int idadeInicio = Integer.parseInt(sc.nextLine().trim());
		lista.inserirInicio(new Aluno(nomeInicio, idadeInicio));

		System.out.print("\nNome do aluno para o FIM da lista: ");
		String nomeFim = sc.nextLine().trim();
		System.out.print("Idade: ");
		int idadeFim = Integer.parseInt(sc.nextLine().trim());
		lista.inserirFim(new Aluno(nomeFim, idadeFim)); // ESSA LINHA NÃO PODE FALTAR

		System.out.println("\nLista dos 7 alunos:");
		lista.listar();
	}
}
