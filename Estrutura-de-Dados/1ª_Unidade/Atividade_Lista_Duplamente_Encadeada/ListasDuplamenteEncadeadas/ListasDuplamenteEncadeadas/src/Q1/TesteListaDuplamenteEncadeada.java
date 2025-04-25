package Q1;

public class TesteListaDuplamenteEncadeada {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

		lista.inserirEsquerda(10);
		lista.inserirEsquerda(20);
		lista.inserirEsquerda(30);

		lista.inserirDireita(40);
		lista.inserirDireita(50);
		lista.inserirDireita(60);

		lista.listarImprimir();
	}
}