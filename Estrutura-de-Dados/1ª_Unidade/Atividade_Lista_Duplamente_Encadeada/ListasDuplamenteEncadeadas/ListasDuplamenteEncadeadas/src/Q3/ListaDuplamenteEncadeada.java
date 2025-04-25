package Q3;

public class ListaDuplamenteEncadeada {

	private No inicio;
	private No fim;

	public void inserirInicio(Aluno aluno) {
		No novo = new No(aluno);
		if (inicio == null) {
			inicio = fim = novo;
		} else {
			novo.proximo = inicio;
			inicio.anterior = novo;
			inicio = novo;
		}
	}

	public void inserirFim(Aluno aluno) {
		No novo = new No(aluno);

		if (inicio == null) {
			inicio = fim = novo;
		} else {
			fim.proximo = novo;
			novo.anterior = fim;
			fim = novo;
		}
	}

	public void listar() {
		No atual = inicio;
		while (atual != null) {
			System.out.println(atual.aluno);
			atual = atual.proximo;
		}
	}
}
