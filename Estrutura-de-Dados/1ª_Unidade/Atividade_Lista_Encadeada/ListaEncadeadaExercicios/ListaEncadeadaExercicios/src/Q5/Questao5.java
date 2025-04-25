package Q5;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		int limite = 7;

		int opcao;

		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1. Inserir no Início");
			System.out.println("2. Inserir no Fim");
			System.out.println("3. Listar Números");
			System.out.println("0. Sair");
			System.out.print("Opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				if (lista.size() >= limite) {
					System.out.println("A lista está cheia! (Máximo: 7 elementos)");
				} else {
					System.out.print("Digite o número: ");
					int numInicio = sc.nextInt();
					lista.add(0, numInicio); 
					System.out.println("Número adicionado no início.");
				}
				break;

			case 2:
				if (lista.size() >= limite) {
					System.out.println("A lista está cheia! (Máximo: 7 elementos)");
				} else {
					System.out.print("Digite o número: ");
					int numFim = sc.nextInt();
					lista.add(numFim); 
					System.out.println("Número adicionado no fim.");
				}
				break;

			case 3:
				System.out.println("Números na lista:");
				for (int i = 0; i < lista.size(); i++) {
					System.out.println("Posição " + i + ": " + lista.get(i));
				}
				break;

			case 0:
				System.out.println("Encerrando programa...");
				break;

			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);
	}
}
