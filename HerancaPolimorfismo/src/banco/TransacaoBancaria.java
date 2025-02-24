package banco;

public interface TransacaoBancaria {
	public void depositar(double valor);
	
	public void sacar(double valor);
	
	public double getSaldo();
}