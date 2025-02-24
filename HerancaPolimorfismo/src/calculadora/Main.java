package calculadora;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.printf("Qual operação deseja realizar? \nAdição, Subtração, Multiplicação, Divisão\n");
		String operacao = leitor.nextLine();
		
		System.out.println("Digite o valor de A: ");
		int a = leitor.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int b = leitor.nextInt();
		
		leitor.close();
		
		if (operacao.toLowerCase() == "adição") {
			Adicao adicao = new Adicao();
			adicao.calcular(a, b);
		} else if (operacao.toLowerCase() == "subtração") {
			Subtracao subtracao = new Subtracao();
			subtracao.calcular(a, b);
		} else if (operacao.toLowerCase() == "multiplicação") {
			Multiplicacao multiplicacao = new Multiplicacao();
			multiplicacao.calcular(a, b);
		} else if (operacao.toLowerCase() == "divisão") {
			Divisao divisao = new Divisao();
			divisao.calcular(a, b);
		}
	}
}
