package exceptions;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		try {
			System.out.println("Escolha o tipo de conta: ");
			System.out.printf("- Normal (N) \n- Especial (E)\n");
			String tipoConta = leitor.nextLine();

			System.out.println("Defina um saldo inicial: ");
			double saldoInicial = leitor.nextDouble();

			System.out.println("Digite o valor do saque: ");
			double valorSaque = leitor.nextDouble();

			TransacaoBancaria conta;

			if (tipoConta.equalsIgnoreCase("N")) {
				conta = new ContaBancaria(saldoInicial);
			} else if (tipoConta.equalsIgnoreCase("E")) {
				conta = new ContaEspecial(saldoInicial);
			} else {
				System.out.println("Tipo de conta inválido!");
				return;
			}

			try {
				conta.sacar(valorSaque);
				System.out.println("Saque relizado com sucesso.");
			} catch (SaldoInsuficienteException e) {
				System.out.println(e.getMessage());
			}
		} finally {
			leitor.close();
		}
	}
}