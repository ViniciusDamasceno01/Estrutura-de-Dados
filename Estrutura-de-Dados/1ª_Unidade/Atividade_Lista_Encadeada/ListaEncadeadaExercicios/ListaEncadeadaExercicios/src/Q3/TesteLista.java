package Q3;

import java.util.Scanner;

public class TesteLista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListaEncadeada lista = new ListaEncadeada();

		  System.out.println("Digite 15 números inteiros para armazenar na lista:");
	        for (int i = 1; i <= 15; i++) {
	            System.out.print("Número " + i + ": ");
	            int numero = sc.nextInt();
	            lista.Adicionar(numero);
	        }

	        int opcao;

	        do {
	            System.out.println("\n--- MENU ---");
	            System.out.println("1. Listar números");
	            System.out.println("2. Buscar posição de um número");
	            System.out.println("0. Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = sc.nextInt();

	            switch (opcao) {
	                case 1:
	                    lista.listar();
	                    break;

	                case 2:
	                    System.out.print("Digite o número que deseja buscar: ");
	                    int numBusca = sc.nextInt();
	                    lista.buscarPosicao(numBusca);
	                    break;

	                case 0:
	                    System.out.println("Saindo...");
	                    break;

	                default:
	                    System.out.println("Opção inválida.");
	                    break;
	            }

	        } while (opcao != 0);

	        sc.close();
	    }
	}