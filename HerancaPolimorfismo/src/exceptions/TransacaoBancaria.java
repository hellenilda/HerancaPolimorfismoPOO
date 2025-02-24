package exceptions;

public interface TransacaoBancaria {
	public void depositar(double valor);
	
	public void sacar(double valor) throws SaldoInsuficienteException;
	
	public double getSaldo();
}