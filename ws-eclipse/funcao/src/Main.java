import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a,b,c);//chamada da função
		mostrarResultado(maior);//chamada da função
		
		sc.close();
	}
	// função criar para saber qual o maior numero dentre 3 numeros
	public static int max(int x,int y,int z) {
		int aux;
		if(x>y && x >z) {
			aux = x;
		}else if(y>z) {
			aux =y;
		}else {
			aux=z;
		}
		return aux;
		}
	//função criada para mostrar o resultado na tela
	public static void mostrarResultado(int value) {
		System.out.println("Maior" + value);
	}
}
