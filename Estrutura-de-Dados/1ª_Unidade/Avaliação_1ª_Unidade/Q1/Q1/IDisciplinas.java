package Q1;

public interface IDisciplinas {
	
	//Adicionar, Listar, Alterar e Excluir.

	public boolean adicionarDisciplina(String nomeDisciplina, String nomeProfessor, int Media);
	public void listarDisciplina();
	public boolean alterarDisciplina(String nomeDisciplina, String nomeProfessor, int Media);
	public boolean excluirDisciplina();

}
