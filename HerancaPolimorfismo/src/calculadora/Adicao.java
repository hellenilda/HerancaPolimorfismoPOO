package calculadora;

public class Adicao extends OperacaoMatematica {

	public void calcular(double a, double b) {
		int resultado = (int) (a + b);
		System.out.println("Resultado da soma: " + resultado);
	}
}