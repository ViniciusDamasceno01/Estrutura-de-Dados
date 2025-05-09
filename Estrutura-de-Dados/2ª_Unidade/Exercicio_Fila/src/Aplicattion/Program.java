package Aplicattion;

import java.util.LinkedList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
	        LinkedList<String> fila = new LinkedList<>();

	        // Entrada dos nomes (com validação)
	        int quantidade;
	        do {
	            System.out.print("Quantos professores deseja adicionar? ");
	            quantidade = scanner.nextInt();
	        } while (quantidade <= 0);
	        scanner.nextLine(); // Limpar buffer

	        for (int i = 0; i < quantidade; i++) {
	            System.out.print("Digite o nome do professor " + (i + 1) + ": ");
	            fila.addLast(scanner.nextLine());
	        }

	        // Tamanho e primeiro
	        System.out.println("\nTamanho da fila: " + fila.size());
	        System.out.println("Primeiro da fila: " + (fila.isEmpty() ? "(Fila vazia)" : fila.getFirst()));

	        // Listar fila
	        System.out.println("\nFila completa:");
	        fila.forEach(nome -> System.out.println("- " + nome));

	        // Remoção
	        if (!fila.isEmpty()) {
	            String removido = fila.removeFirst();
	            System.out.println("\nPrimeiro professor removido: " + removido);
	        }

	        // Fila após remoção
	        System.out.println("\nFila após remoção:");
	        if (fila.isEmpty()) {
	            System.out.println("(Fila vazia)");
	        } else {
	            fila.forEach(nome -> System.out.println("- " + nome));
	        }
	    } // Scanner fecha aqui
	}
}
