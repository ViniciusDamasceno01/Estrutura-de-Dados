package Q3;

public class Celula {

	private String nome;
	private Celula proximo;

	public Celula() {
		super();
		this.nome = nome;
		this.proximo = proximo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

}
