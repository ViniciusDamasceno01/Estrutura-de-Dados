package Q4;

public class ListaDuplamenteEncadeada {

	private Nodo primeiro = null;
	private Nodo ultimo = null;
	private int n = 0;

	public void inserirEsquerda(int dado) {
		Nodo aux = new Nodo();
		aux.dado = dado;

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

	public void listarImprimir() {
		Nodo aux = primeiro;
		if (aux != null) {
			System.out.println("\nNumeros:");
			while (aux != null) {
				System.out.println("- " + aux.getDado());
				aux = aux.getProximo();
			}
		} else {
			System.out.println("A lista está vazia.");
		}
	}
}
