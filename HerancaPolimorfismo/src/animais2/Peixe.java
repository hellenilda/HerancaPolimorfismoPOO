package animais2;

public class Peixe extends Animal {
	
	public Peixe(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		return "Peixe [nome=" + getNome() + "]";
	}
}
