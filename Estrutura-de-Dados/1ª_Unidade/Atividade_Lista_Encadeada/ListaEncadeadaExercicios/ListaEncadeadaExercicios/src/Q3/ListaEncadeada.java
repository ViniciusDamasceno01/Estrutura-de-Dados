package Q3;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;

	public void Adicionar(int valor) {

		Celula celula = new Celula(valor);

		if (primeiro == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
	}

	public void listar() {
		if (primeiro == null) {
			System.out.println("A lista está vazia.");
			return;
		}

		Celula atual = primeiro;
		System.out.println("Numero cadastrados:");
		while (atual != null) {
			System.out.println("- " + atual.getValor());
			atual = atual.getProximo();
		}
	}

	public void buscarPosicao(int numero) {
	    Celula atual = primeiro;
	    int posicao = 0;
	    boolean encontrado = false;

	    while (atual != null) {
	        if (atual.getValor() == numero) {
	            System.out.println("Número " + numero + " encontrado na posição: " + posicao);
	            encontrado = true;
	            break;
	        }
	        atual = atual.getProximo();
	        posicao++;
	    }

	    if (!encontrado) {
	        System.out.println("Número " + numero + " não encontrado na lista.");
	    }
	}
}