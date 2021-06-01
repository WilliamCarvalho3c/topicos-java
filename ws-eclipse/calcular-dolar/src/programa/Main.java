package programa;

import java.util.Locale;
import java.util.Scanner;

import calculadora.Calcular;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double total;
		
		System.out.print("Qual o preço do dollar? ");
		Calcular.real = sc.nextDouble();
		System.out.print("Quanto dollares pretende comprar? ");
		Calcular.dollar = sc.nextDouble();
		
		total = Calcular.totalPagar(total);
			
		System.out.printf("O total a se pagar em reais = ",total);
		
		
		sc.close();
	}

}
