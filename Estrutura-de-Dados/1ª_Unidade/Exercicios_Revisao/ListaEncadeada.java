package Q3;

public class ListaEncadeada {

	private Celula primeiro = null;
	private Celula ultimo = null;

	public void inserirFinal(int valor) {
		Celula nova = new Celula(valor);
		if (primeiro == null) {
			primeiro = nova;
			ultimo = nova;
		} else {
			ultimo.setProximo(nova);
			ultimo = nova;
		}
	}

	public void removerFinal() {
		if (primeiro == null) {
			System.out.println("A lista está vazia, nada para remover.");
			return;
		}
		if (primeiro == ultimo) {
			primeiro = ultimo = null;
		} else {
			Celula atual = primeiro;
			while (atual.getProximo() != null && atual.getProximo() != ultimo) {
				atual = atual.getProximo();
			}
			atual.setProximo(null);
			ultimo = atual;
		}
		System.out.println("Último elemento removido com sucesso.");
	}

	public void listarElementos() {
		if (primeiro == null) {
			System.out.println("A lista está vazia.");
			return;
		}
		Celula aux = primeiro;
		System.out.print("Lista: ");
		while (aux != null) {
			System.out.print(aux.getValor() + " ");
			aux = aux.getProximo();
		}
		System.out.println();
	}
}