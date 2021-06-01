package util;

public class Calculadora {
	public static final double PI = 3.14159;
	// ao definir static na classe, voce n�o precisa instanciar o objeto, voce pode chamar ele direto pelo nome da classe.
	public static double circunferencia(double raio) {
		return 2.0*PI*raio;
	}
	public static double volume(double raio) {
		return 4.0*PI*raio*raio*raio/3.0;
	}
}
