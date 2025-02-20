package questao1;

public interface TransacaoBancaria {
	public double depositar(double valor);
	
	public double sacar(double valor);
	
	public double getSaldo();
}
