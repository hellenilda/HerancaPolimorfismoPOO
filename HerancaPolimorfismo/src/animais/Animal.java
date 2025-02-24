package animais;

public abstract class Animal {
	String nome;
	double peso;

	public Animal(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	@Override
	public abstract String toString();

}
