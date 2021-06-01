import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hora;
		
		
		System.out.println("Digite a hora");
		hora = sc.nextDouble();
		if(hora < 12) {
			System.out.println("Bom dia!");
		}
		else if(hora <18) {
			System.out.println("boa tarde!");
		}
		else {
			System.out.println("boa noite!");
		}
			
		
		sc.close();
	}

}
