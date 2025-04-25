package Q4;

public class Aluno {
	private static int contadorMatricula = 1;
	private String nome;
	private int matricula;

	public Aluno(String nome) {
			this.nome = nome;
			this.matricula = contadorMatricula++;
		}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Matrícula: " + matricula + " | Nome: " + nome;
	}

	public boolean equalsIgnoreCase(String nome2) {
		// TODO Auto-generated method stub
		return false;
	}
}
