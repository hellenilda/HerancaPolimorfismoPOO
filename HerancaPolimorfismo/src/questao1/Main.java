package questao1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escolha o tipo de conta: ");
		System.out.printf("- Normal (N) \n- Especial (E)\n");
		String tipoConta = leitor.nextLine();
		
		System.out.println("Defina um saldo inicial: ");
		double saldoInicial = leitor.nextDouble();
		
		System.out.println("Digite o valor do saque: ");
		double valorSaque = leitor.nextDouble();
		
		if (tipoConta.toUpperCase() == "N") {
			ContaBancaria normal = new ContaBancaria(saldoInicial);
			normal.sacar(valorSaque);
		} else if (tipoConta.toUpperCase() == "E") {
			ContaEspecial especial = new ContaEspecial(saldoInicial);
			especial.sacar(valorSaque);
		}
	}
}