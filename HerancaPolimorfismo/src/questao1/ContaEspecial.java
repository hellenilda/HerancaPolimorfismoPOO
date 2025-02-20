package questao1;

public class ContaEspecial implements TransacaoBancaria {
	private String titular;
	private int numeroConta;
	private double saldo;

	public ContaEspecial(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito realizado. Saldo atual: R$ " + saldo);
		} else {
			System.out.println("Valor de depósito inválido!");
		}
	}

	public void sacar(double valor) {
		double taxa = 0.50;
		if (valor + taxa > saldo) {
			System.out.println("Saldo insuficiente para saque.");
		} else {
			saldo -= (valor + taxa);
			System.out.println("Saque realizado. Saldo atual: R$ " + saldo);
		}
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
