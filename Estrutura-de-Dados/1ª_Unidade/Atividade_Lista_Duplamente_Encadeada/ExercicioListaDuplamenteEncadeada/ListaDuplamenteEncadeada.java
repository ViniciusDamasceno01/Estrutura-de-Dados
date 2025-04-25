package Atividade;

public class ListaDuplamenteEncadeada {

	private Nodo primeiro = null;
	private Nodo ultimo = null;
	private int n = 0;

	public void inserirListaEsquerda(int valor) {
		Nodo aux = new Nodo();
		aux.setDado(valor);

		if (n == 0) {
			primeiro = aux;
			ultimo = aux;
		} else {
			aux.setProximo(primeiro);
			primeiro.setAnterior(aux);
			primeiro = aux;
		}
		n++;
	}

	public void inserirListaDireita(int valor) {
		Nodo aux = new Nodo();
		aux.setDado(valor);

		if (n == 0) {
			primeiro = aux;
			ultimo = aux;
		} else {
			aux.setAnterior(ultimo);
			ultimo.setProximo(aux);
			ultimo = aux;
		}
		n++;
	}

	public int removerListaDireita() {
		if (n == 0)
			return 0;

		int dado = ultimo.getDado();
		n--;

		if (n == 0) {
			primeiro = null;
			ultimo = null;
		} else {
			Nodo anterior = ultimo.getAnterior();
			anterior.setProximo(null);
			ultimo = anterior;
		}

		return dado;
	}

	public int removerListaEsquerda() {
		if (n == 0)
			return 0;

		int dado = primeiro.getDado();
		n--;

		if (n == 0) {
			primeiro = null;
			ultimo = null;
		} else {
			Nodo proximo = primeiro.getProximo();
			proximo.setAnterior(null);
			primeiro = proximo;
		}

		return dado;
	}

	public void listarListaImprimir() {
		Nodo aux = primeiro;
		System.out.println("Lista (esquerda → direita):");
		if (aux != null) {
			while (aux != null) {
				System.out.print(aux.getDado() + " ");
				aux = aux.getProximo();
			}
			System.out.println();
		} else {
			System.out.println("A lista está vazia.");
		}
	}

	public void listarListaReversa() {
		Nodo aux = ultimo;
		System.out.println("Lista (direita → esquerda):");
		if (aux != null) {
			while (aux != null) {
				System.out.print(aux.getDado() + " ");
				aux = aux.getAnterior();
			}
			System.out.println();
		} else {
			System.out.println("A lista está vazia.");
		}
	}
}