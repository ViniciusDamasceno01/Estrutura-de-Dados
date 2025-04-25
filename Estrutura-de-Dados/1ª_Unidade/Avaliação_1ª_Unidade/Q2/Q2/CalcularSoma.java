package Q2;

public class CalcularSoma {

	public static int somaNaturais(int n) {
		if (n == 1)
			return 1; // Caso base
		return n + somaNaturais(n - 1); // Chamada recursiva
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println("Soma dos naturais de 1 até " + n + " é: " + somaNaturais(n));
	}
}
