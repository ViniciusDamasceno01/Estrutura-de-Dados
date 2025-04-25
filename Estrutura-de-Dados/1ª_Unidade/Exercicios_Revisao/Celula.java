package Q3;

public class Celula {

	private int valor;
	private Celula proximo;

	public Celula(int dado) {
        this.valor = dado;
        this.proximo = null;
    }

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

}
