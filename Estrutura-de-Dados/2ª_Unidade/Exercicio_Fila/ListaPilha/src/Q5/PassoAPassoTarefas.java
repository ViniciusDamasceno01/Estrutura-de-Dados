package Q5;

import java.util.Stack;

public class PassoAPassoTarefas {

	private Stack<String> pilhaTarefas;

	public void criarPilha() {
		pilhaTarefas = new Stack<>();
		System.out.println("Pilha de tarefas criada. Pronta para uso!");
	}

	public void adicionarTarefa(String tarefa) {
		if (tarefa == null || tarefa.trim().isEmpty()) {
			System.out.println("Erro: Tarefa inválida!");
		} else {
			pilhaTarefas.push(tarefa);
			System.out.println("Tarefa adicionada: \"" + tarefa + "\"");
		}
	}

	public void concluirTarefa() {
		if (pilhaTarefas.isEmpty()) {
			System.out.println("AVISO: Todas as tarefas foram concluídas! 🎉");
		} else {
			String tarefaConcluida = pilhaTarefas.pop();
			System.out.println("Tarefa concluída: \"" + tarefaConcluida + "\"");

			if (pilhaTarefas.isEmpty()) {
				System.out.println("✅ TODAS AS TAREFAS FORAM FINALIZADAS!");
			}
		}
	}

	public void verProximaTarefa() {
		if (pilhaTarefas.isEmpty()) {
			System.out.println("Nenhuma tarefa pendente.");
		} else {
			System.out.println("Próxima tarefa: \"" + pilhaTarefas.peek() + "\"");
		}
	}
}
