package Q4;

import java.util.Scanner;

public class TesteListaDuplamenteEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

		int[] primos = { 2, 3, 5, 7, 11 };
		for (int i = 0; i < primos.length; i++) {
			lista.inserirEsquerda(primos[i]);
		}

		lista.listarImprimir();
	}
}
