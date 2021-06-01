package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC, areaX, areaY, p;
		
		System.out.println("Entre com as medidas do triangulo X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Entra com a medidas do triangulo Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		p =  (xA + xB + xC)/2.0;
		areaX = Math.sqrt(p * (p -xA)*(p-xB)*(p-xC));
		
		p = (yA + yB + yC)/2.0;
		areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p- yC));
		sc.close();
		
		System.out.println("Area x "+ areaX);
		System.out.println("Area y "+ areaY);
		
		if(areaX > areaY ) {
			System.out.println("Area X");
		}else {
			System.out.println("Area Y");
		}
	}

}
