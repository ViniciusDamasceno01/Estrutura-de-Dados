package Q2;

public class ListaEncadeada {
	private No inicio;

	public ListaEncadeada() {
		this.inicio = null;
	}

	public void adicionar(String nome) {
		nome = nome.trim();
		No novo = new No(nome);
		if (inicio == null) {
			inicio = novo;
		} else {
			No atual = inicio;
			while (atual.proximo != null) {
				atual = atual.proximo;
			}
			atual.proximo = novo;
		}
	}

	public boolean contem(String nome) {
		nome = nome.trim();
		No atual = inicio;
		while (atual != null) {
			if (atual.nome.equalsIgnoreCase(nome)) {
				return true;
			}
			atual = atual.proximo;
		}
		return false;
	}

	public void listar() {
		No atual = inicio;
		while (atual != null) {
			System.out.print(atual.nome + " ");
			atual = atual.proximo;
		}
		System.out.println();
	}

	public No getInicio() {
		return inicio;
	}
}
