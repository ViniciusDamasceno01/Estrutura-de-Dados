package Q5;

public class Paciente {

	private String nome;

	public Paciente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Paciente: " + nome;
	}
}
