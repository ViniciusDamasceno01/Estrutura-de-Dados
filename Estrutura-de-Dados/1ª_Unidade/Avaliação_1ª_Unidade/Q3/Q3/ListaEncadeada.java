package Q3;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private int tamanho;

	// METODO ADICIONAR

	public void Adicionar(String nome) {

		Celula celula = new Celula();
		celula.setNome(nome);

		if (primeiro == null) {
			primeiro = celula;
			ultimo = celula;
		} else {

			ultimo.setProximo(celula);

			ultimo = celula;
		}
		tamanho++;
	}

	// METODO VERIFICAR TAMANHO

	public int TamanhoLista() {
		return tamanho;

	}

	// METODO PARA MOSTRAR LISTA

	public void listar() {
		if (primeiro == null) {
			System.out.println("A lista está vazia.");
			return;
		}

		Celula atual = primeiro;
		System.out.println("Musicas cadastradas na lista:");
		while (atual != null) {
			System.out.println("- " + atual.getNome());
			atual = atual.getProximo();
		}
	}
}
