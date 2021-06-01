import java.util.Locale;
import java.util.Scanner;

public class Inter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double entrada = sc.nextDouble();
		
		if(entrada > 0 && entrada <= 25.00) {
			System.out.println("intervalo (0,25]");
		}else if(entrada > 25 && entrada <= 50) {
			System.out.println("intervalo (25,50]");
		}else if(entrada > 50 && entrada <= 75) {
			System.out.println("intervalo (50,75]");
		}else if(entrada > 75 && entrada <= 100) {
			System.out.println("intervalo (75,100]");
		}else {
			System.out.println("Fora de intervalo");
		}
		
		
		sc.close();
	}

}
