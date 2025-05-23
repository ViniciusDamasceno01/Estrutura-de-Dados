package Q2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CallCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        Queue<Contato> filaContatos = new LinkedList<>();
	        int opcao;

	        do {
	            System.out.println("\n--- MENU CALLCENTER ---");
	            System.out.println("1 - Inserir Contato");
	            System.out.println("2 - Próximo Contato");
	            System.out.println("3 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt()
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do contato: ");
	                    String nome = scanner.nextLine();
	                    System.out.print("Digite o telefone do contato: ");
	                    String telefone = scanner.nextLine();
	                    filaContatos.add(new Contato(nome, telefone));
	                    System.out.println("Contato adicionado à fila.");
	                    break;

	                case 2:
	                    if (filaContatos.isEmpty()) {
	                        System.out.println("A fila está vazia.");
	                    } else {
	                        Contato proximo = filaContatos.poll(); 
	                        System.out.println("Efetue o contato com o seguinte cliente:");
	                        System.out.println(proximo);
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
	}
	


