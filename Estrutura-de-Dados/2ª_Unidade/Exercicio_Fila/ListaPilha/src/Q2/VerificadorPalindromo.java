package Q2;

import java.util.Scanner;
import java.util.Stack;

public class VerificadorPalindromo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma palavra ou frase: ");
		String texto = scanner.nextLine();

		if (verificarPalindromo(texto)) {
			System.out.println("É um palíndromo! ");
		} else {
			System.out.println("Não é um palíndromo.");
		}
	}

	public static boolean verificarPalindromo(String texto) {

		String textoLimpo = texto.replaceAll("[^a-zA-Z]", "").toLowerCase();

		Stack<Character> pilha = new Stack<>();

		for (char letra : textoLimpo.toCharArray()) {
			pilha.push(letra);
		}

		for (char letra : textoLimpo.toCharArray()) {
			if (letra != pilha.pop()) {
				return false;
			}
		}

		return true;
	}
}
