package Q2;

public class ListaMatricula {

	private Celula primeiro;
	private Celula ultimo;

	public void Adicionar(String nome) {
		Aluno aluno = new Aluno(nome);
		Celula celula = new Celula(aluno);

		if (primeiro == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
	}

	public void RemoverInicio() {
		if (primeiro == null) {
			System.out.println("Lista está vazia! Nada a remover.");
			return;
		}
		System.out.println("Removido: " + primeiro.getAluno());
		primeiro = primeiro.getProximo();

		if (primeiro == null) {
			ultimo = null;
		}
	}


	public void RemoverDoMeio(String nome) {
		if (primeiro == null || primeiro == ultimo) {
			System.out.println("Não há elementos suficientes para remover do meio.");
			return;
		}

		Celula anterior = null;
		Celula atual = primeiro;

		while (atual != null && !atual.getAluno().equalsIgnoreCase(nome)) {
			anterior = atual;
			atual = atual.getProximo();
		}

		if (atual == null || atual == primeiro || atual == ultimo) {
			System.out.println("Elemento não encontrado no meio da lista.");
			return;
		}

		anterior.setProximo(atual.getProximo());
		System.out.println("Removido do meio: " + atual.getAluno());

	}


	public void RemoverUltimo() {
		if (primeiro == null) {
			System.out.println("A lista está vazia.");
			return;
		}

		if (primeiro == ultimo) {
			System.out.println("Removido: " + primeiro.getAluno());
			primeiro = null;
			ultimo = null;
			return;
		}

		Celula atual = primeiro;
		while (atual.getProximo() != ultimo) {
			atual = atual.getProximo();
		}

		System.out.println("Removido: " + ultimo.getAluno());
		atual.setProximo(null);
		ultimo = atual;
	}

	public void listar() {
		if (primeiro == null) {
			System.out.println("A lista está vazia.");
			return;
		}

		Celula atual = primeiro;
		System.out.println("Professores cadastrados:");
		while (atual != null) {
			System.out.println("- " + atual.getAluno());
			atual = atual.getProximo();
		}
	}

	public void pesquisar(String nome) {
		Celula atual = primeiro;
		while (atual != null) {
			if (atual.getAluno().getNome().equalsIgnoreCase(nome)) {
				System.out.println("Aluno encontrado: " + nome);
				return;
			}
			atual = atual.getProximo();
		}
		System.out.println("Aluno não encontrado.");
	}

	public void ordenarAlfabeticamente() {
		if (primeiro == null || primeiro.getProximo() == null)
			return;

		boolean trocado;
		do {
			trocado = false;
			Celula atual = primeiro;

			while (atual.getProximo() != null) {
				Celula proximo = atual.getProximo();
				if (atual.getAluno().getNome().compareToIgnoreCase(proximo.getAluno().getNome()) > 0) {
					// Troca os alunos
					Aluno temp = atual.getAluno();
					atual.setAluno(proximo.getAluno());
					proximo.setAluno(temp);
					trocado = true;
				}
				atual = atual.getProximo();
			}
		} while (trocado);
	}

	public void RemoverDoMeio() {
		// TODO Auto-generated method stub

	}
}
