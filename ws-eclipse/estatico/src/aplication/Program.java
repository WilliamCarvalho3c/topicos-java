package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*se voc
		*/
		
		System.out.println("Entre com o raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculadora.circunferencia(raio);
		double v = Calculadora.volume(raio);
		
		System.out.printf("Circunferen: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI valor: %.2f%n", Calculadora.PI);
		
		
		sc.close();

	}
	

}
