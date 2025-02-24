package animais;

public class Cachorro extends Animal {
	private String raca;

	public Cachorro(String nome, double peso, String raca) {
		super(nome, peso);
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + ", peso=" + peso + ", raca=" + raca + "]";
	}

}
