import java.util.Locale;
import java.util.Scanner;

public class Tabe {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double codigo, qtd, total=0;
		
		codigo = sc.nextDouble();
		qtd = sc.nextDouble();
		
		if(codigo == 1){
			total = qtd * 4.00;
		}else if(codigo == 2) {
			total = qtd * 4.50;
		}else if (codigo == 3) {
			total = qtd * 5.00;
		}else if(codigo == 4) {
			total = qtd * 5.00;
		}else if(codigo ==5) {
			total = qtd * 1.50;
		}
		
		System.out.printf("Total: R$%.2f%n ", total);
		
		
		
		
		sc.close();
	}

}
