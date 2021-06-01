import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um numero inteiro.");
		x = sc.nextInt();
		
		if(x >=0) {
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEVATIVO");
		}
			
		sc.close();
	}

}
