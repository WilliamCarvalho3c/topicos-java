package curso_programacao2;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		 x = sc.next();
		 y = sc.nextInt();
		 z = sc.nextDouble();
		 
		 System.out.println("Dados digitados ");
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
		
		
		// x =sc.next(); recebe string
		//x = sc.nextInt(); para digitar um numero inteiro
		//x = sc.nextDouble(); para digitar numero double
		//x = sc.next().charAt(0); para digitar um caracter
		
		//System.out.println("Voce digitou:  " + x);
		
		
		
		sc.close();

	}

}
