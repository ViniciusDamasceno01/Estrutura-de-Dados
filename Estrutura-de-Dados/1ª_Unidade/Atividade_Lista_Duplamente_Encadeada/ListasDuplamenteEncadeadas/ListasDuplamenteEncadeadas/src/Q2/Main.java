package Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ListaEncadeada L1 = new ListaEncadeada();
		ListaEncadeada L2 = new ListaEncadeada();
		ListaEncadeada comuns = new ListaEncadeada();

		System.out.println("Digite 5 nomes para a lista L1:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Nome " + (i + 1) + ": ");
			L1.adicionar(sc.nextLine());
		}

		System.out.println("\nDigite 5 nomes para a lista L2:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Nome " + (i + 1) + ": ");
			L2.adicionar(sc.nextLine());
		}

		
		No atual = L1.getInicio();
		while (atual != null) {
			if (L2.contem(atual.nome)) {
				if (!comuns.contem(atual.nome)) { 
					comuns.adicionar(atual.nome);
				}
			}
			atual = atual.proximo;
		}

		System.out.println("\nNomes comuns às duas listas:");
		comuns.listar();
	}
}
