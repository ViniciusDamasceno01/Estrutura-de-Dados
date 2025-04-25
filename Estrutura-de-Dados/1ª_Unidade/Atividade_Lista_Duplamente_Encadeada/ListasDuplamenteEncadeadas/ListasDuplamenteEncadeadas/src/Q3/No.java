package Q3;

public class No {

	Aluno aluno;
	No anterior;
	No proximo;

	public No(Aluno aluno) {
		this.aluno = aluno;
		this.anterior = null;
		this.proximo = null;
	}
}
