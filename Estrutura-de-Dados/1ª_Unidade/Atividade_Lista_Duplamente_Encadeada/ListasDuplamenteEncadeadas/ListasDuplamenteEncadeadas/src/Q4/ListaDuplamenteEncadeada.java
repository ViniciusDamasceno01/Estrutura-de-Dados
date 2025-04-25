package Q4;

public class ListaDuplamenteEncadeada {

	No inicio, fim;

	public void inserirInicio(int valor) {
		No novo = new No(valor);
		if (inicio == null) {
			inicio = fim = novo;
		} else {
			novo.proximo = inicio;
			inicio.anterior = novo;
			inicio = novo;
		}
	}

	public void inserirFim(int valor) {
		No novo = new No(valor);
		if (fim == null) {
			inicio = fim = novo;
		} else {
			fim.proximo = novo;
			novo.anterior = fim;
			fim = novo;
		}
	}

	public void removerInicio() {
		if (inicio == null) {
			System.out.println("Lista vazia.");
			return;
		}
		if (inicio == fim) {
			inicio = fim = null;
		} else {
			inicio = inicio.proximo;
			inicio.anterior = null;
		}
	}

	public void removerFim() {
		if (fim == null) {
			System.out.println("Lista vazia.");
			return;
		}
		if (inicio == fim) {
			inicio = fim = null;
		} else {
			fim = fim.anterior;
			fim.proximo = null;
		}
	}

	public void listar() {
		if (inicio == null) {
			System.out.println("Lista vazia.");
			return;
		}
		No atual = inicio;
		System.out.print("Lista: ");
		while (atual != null) {
			System.out.print(atual.valor + " ");
			atual = atual.proximo;
		}
		System.out.println();
	}
}
