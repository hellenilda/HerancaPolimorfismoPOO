package animais2;

public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome);
	}

	@Override
	public String toString() {
		return "Cachorro [nome=" + getNome() + "]";
	}
}
