package Q4;

import java.util.Stack;

public class NavegadorWeb {

	private Stack<String> pilhaHistorico;

	public void inicializarPilha() {
		pilhaHistorico = new Stack<>();
		System.out.println("Histórico inicializado. Pilha vazia.");
	}

	public void pushPagina(String url) {
		if (url == null || url.trim().isEmpty()) {
			System.out.println("Erro: URL inválida!");
		} else {
			pilhaHistorico.push(url);
			System.out.println("Página adicionada: " + url);
		}
	}

	public String popPagina() {
		if (pilhaHistorico.isEmpty()) {
			System.out.println("Aviso: Histórico vazio!");
			return null;
		} else {
			String urlRemovida = pilhaHistorico.pop();
			System.out.println("Voltando para: " + urlRemovida);
			return urlRemovida;
		}
	}

	public String verTopo() {
		if (pilhaHistorico.isEmpty()) {
			return null;
		}
		return pilhaHistorico.peek();
	}

}
