package calculadora;


public class Calcular {
	public static final double TAX = 6;
	public static double real;
	public static double dollar;
			
	public static double totalPagar(double total) {
		return dollar*real*TAX/100;
	}
}
