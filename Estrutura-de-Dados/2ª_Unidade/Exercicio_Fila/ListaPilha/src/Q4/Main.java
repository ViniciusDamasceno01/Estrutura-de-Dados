package Q4;

public class Main {

	public static void main(String[] args) {
		NavegadorWeb navegador = new NavegadorWeb();
		navegador.inicializarPilha();

		navegador.pushPagina("https://www.google.com");
		navegador.pushPagina("https://www.github.com");
		navegador.pushPagina("https://www.stackoverflow.com");

		System.out.println("\n--- Voltando no histórico ---");
		navegador.popPagina();
		navegador.popPagina();

		System.out.println("\nPágina atual: " + navegador.verTopo()); // Google
	}
}
