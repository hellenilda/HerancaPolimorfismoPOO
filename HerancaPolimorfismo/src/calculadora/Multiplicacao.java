package calculadora;

public class Multiplicacao extends OperacaoMatematica {
	
	public void calcular(double a, double b) {
		int resultado = (int) (a * b);
		System.out.println("Resultado da multiplicação: " + resultado);
	}
}
