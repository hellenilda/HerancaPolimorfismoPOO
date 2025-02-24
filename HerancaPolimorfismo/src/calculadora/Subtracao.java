package calculadora;

public class Subtracao extends OperacaoMatematica {
	
	public void calcular(double a, double b) {
		int resultado = (int) (a - b);
		System.out.println("Resultado da subtração: " + resultado);
	}
}
