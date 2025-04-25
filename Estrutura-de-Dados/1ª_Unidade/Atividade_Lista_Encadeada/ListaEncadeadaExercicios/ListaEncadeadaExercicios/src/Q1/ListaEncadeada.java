package Q1;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private int tamanho;

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

	public void RemoverInicio() {
		if (primeiro == null) {
			System.out.println("Lista está vazia! Nada a remover.");
			return;
		}
		System.out.println("Removido: " + primeiro.getNome());
		primeiro = primeiro.getProximo();
		tamanho--;

		if (primeiro == null) {
			ultimo = null;
		}
	}

	public void removerDoMeio(String nome) {
		if (primeiro == null || primeiro == ultimo) {
			System.out.println("Não há elementos suficientes para remover do meio.");
			return;
		}

		Celula anterior = null;
		Celula atual = primeiro;

		while (atual != null && !atual.getNome().equalsIgnoreCase(nome)) {
			anterior = atual;
			atual = atual.getProximo();
		}

		if (atual == null || atual == primeiro || atual == ultimo) {
			System.out.println("Elemento não encontrado no meio da lista.");
			return;
		}

		anterior.setProximo(atual.getProximo());
		System.out.println("Removido do meio: " + atual.getNome());
		tamanho--;

	}

	public void removerUltimo() {
		if (primeiro == null) {
			System.out.println("A lista está vazia.");
			return;
		}

		if (primeiro == ultimo) {
			System.out.println("Removido: " + primeiro.getNome());
			primeiro = null;
			ultimo = null;
			tamanho--;
			return;
		}

		Celula atual = primeiro;
		while (atual.getProximo() != ultimo) {
			atual = atual.getProximo();
		}

		System.out.println("Removido: " + ultimo.getNome());
		atual.setProximo(null);
		ultimo = atual;
		tamanho--;
	}

	public int TamanhoLista() {
		return tamanho;
	}

	public boolean estaVazia() {
		return primeiro == null;

	}

	public void apagarLista() {
		primeiro = null;
		ultimo = null;
		tamanho = 0;
		System.out.println("Todos os registros foram apagados.");
	}

	public void listar() {
		if (primeiro == null) {
			System.out.println("A lista está vazia.");
			return;
		}

		Celula atual = primeiro;
		System.out.println("Professores cadastrados:");
		while (atual != null) {
			System.out.println("- " + atual.getNome());
			atual = atual.getProximo();
		}
	}
}
