package Q1;

public class Disciplinas implements IDisciplinas {

	private String nomeDisciplina;
	private String nomeProfessor;
	private int Media;

	public Disciplinas(String nomeDisciplina, String nomeProfessor, int media) {
		super();
		this.nomeDisciplina = nomeDisciplina;
		this.nomeProfessor = nomeProfessor;
		Media = media;
	}

	@Override
	public boolean adicionarDisciplina(String nomeDisciplina, String nomeProfessor, int Media) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void listarDisciplina() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean alterarDisciplina(String nomeDisciplina, String nomeProfessor, int Media) {
		return false;

	}

	@Override
	public boolean excluirDisciplina() {
		return false;
		// TODO Auto-generated method stub
	}
}
