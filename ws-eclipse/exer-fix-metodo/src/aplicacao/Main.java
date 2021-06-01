package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import calcular.Area;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Area area = new Area();
		
		System.out.println("Entre com a largura e a altura do retângulo: ");
		area.largura = sc.nextDouble();
		area.altura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n" , area.calculoArea());
		System.out.printf("PERIMETRO = %.2f%n", area.calculoPerimetro());
		System.out.printf("DIAGONAL = %.2f%n", area.calculoDiagonal());
		
		
		
		sc.close();
	}

}
