package Q4;

public class ListaMatriculaRecursividade {
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

	public void listar() {
		Celula atual = primeiro;
		while (atual != null) {
			System.out
					.println("Nome: " + atual.getAluno().getNome() + ", Matrícula: " + atual.getAluno().getMatricula());
			atual = atual.getProximo();
		}
	}

	public void buscarRecursiva(String nome) {
		boolean encontrado = buscarRecursiva(primeiro, nome);
		if (!encontrado) {
			System.out.println("Aluno não encontrado.");
		}
	}


	private boolean buscarRecursiva(Celula atual, String nome) {
		if (atual == null)
			return false;

		if (atual.getAluno().getNome().equalsIgnoreCase(nome)) {
			System.out.println("Aluno encontrado: " + atual.getAluno().getNome() + ", Matrícula: "
					+ atual.getAluno().getMatricula());
			return true;
		}

		return buscarRecursiva(atual.getProximo(), nome);
	}
}