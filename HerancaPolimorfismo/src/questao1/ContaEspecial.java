package questao1;

public class ContaEspecial implements TransacaoBancaria {
	private String titular;
	private int numeroConta;
	private double saldo;

	public ContaEspecial(double saldo) {
		this.saldo = saldo;
	}

	public double depositar(double valor) {
		this.saldo += valor; // Depósito
		System.out.println("Saldo após o depósito: R$ " + saldo);
		return saldo;
	}

	public double sacar(double valor) {
		this.saldo -= valor; // Saque
		this.saldo -= 0.50; // Taxa
		System.out.println("Saldo após a taxa: R$ " + saldo);
		return saldo;
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
