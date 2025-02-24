package questao3;

public class Peixe extends Animal {
	private String habitat;

	public Peixe(String nome, double peso, String habitat) {
		super(nome, peso);
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "Peixe [nome=" + nome + ", peso=" + peso + ", habitat=" + habitat + "]";
	}

}
