import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double fahren, celsius;
		char resp;
		do {
		System.out.print("Qual a temperatura em Celsius: ");
		celsius = sc.nextDouble();
		fahren = celsius * 9.0 / 5 + 32; 
		System.out.printf("Equivalente em Fahrenheit: %.2f%n",fahren);
		System.out.print("Deseja retir (s/n): ");
		resp = sc.next().charAt(0);
		}while(resp != 'n');
		
		
		
		sc.close();
	}

}
