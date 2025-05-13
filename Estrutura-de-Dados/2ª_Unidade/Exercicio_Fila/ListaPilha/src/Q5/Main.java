package Q5;

public class Main {

	public static void main(String[] args) {
		PassoAPassoTarefas gerenciador = new PassoAPassoTarefas();

		// a) Criar a pilha
		gerenciador.criarPilha();

		// b) Adicionar tarefas (ordem inversa)
		gerenciador.adicionarTarefa("Fechar a tampa");
		gerenciador.adicionarTarefa("Ligar a cafeteira");
		gerenciador.adicionarTarefa("Colocar água e pó de café");
		gerenciador.adicionarTarefa("Pegar a cafeteira");

		System.out.println("\n--- EXECUTANDO TAREFAS ---");

		// c) Concluir tarefas uma a uma
		gerenciador.concluirTarefa(); // Remove "Pegar a cafeteira"
		gerenciador.concluirTarefa(); // Remove "Colocar água e pó de café"
		gerenciador.verProximaTarefa(); // Mostra "Ligar a cafeteira" (sem remover)
		gerenciador.concluirTarefa(); // Remove "Ligar a cafeteira"
		gerenciador.concluirTarefa(); // Remove "Fechar a tampa"

		// d) Tentar concluir além (pilha vazia)
		gerenciador.concluirTarefa(); // Mensagem de conclusão total
	}
}
