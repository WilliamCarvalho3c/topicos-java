import java.util.Scanner;

public class Mult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite dois numeros");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B ==0 || B % A ==0 ) {
			System.out.println("Sao Mutiplos");
		}
		else {
			System.out.println("Não São Mutiplos");
		}
		
		
		sc.close();
	}

}
