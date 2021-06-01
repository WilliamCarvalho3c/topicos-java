
public class Main {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B ,C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("A Raiz quadrada de " + x + " = " + A);
		System.out.println("A Raiz quadrada de " + y + " = " + B);
		System.out.println("A Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("O Valor Absoluto de " + y + " = " + A);
		System.out.println("O Valor Absoluto de " + x + " = " + B);
	}	

}
