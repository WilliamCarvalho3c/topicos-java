package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class Doin {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double areaX, areaY;
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo T area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		
		
		
		
		
		sc.close();

	}

}
