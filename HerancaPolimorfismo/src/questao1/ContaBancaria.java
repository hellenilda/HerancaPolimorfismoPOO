package questao1;

public class ContaBancaria implements TransacaoBancaria {
	private String titular;
	private int numeroConta;
	private double saldo;
	
	public double depositar(double valor) {
		this.saldo += valor; // Depósito
		System.out.println("Saldo após o depósito: R$ " + saldo);
		return saldo;
	}

	public double sacar(double valor) {
		this.saldo -= (valor + 1.00); // Saque + Taxa
		System.out.println("Saldo após a taxa: R$ " + saldo);
		return saldo;
	}

	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
