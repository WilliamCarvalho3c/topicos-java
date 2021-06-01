import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= 3;
		int y= 0;
		
		for(int i=0;i<x; i++) {
			System.out.print(i +",");
			y = y +5;
			System.out.println(y);
		}
		
		sc.close();
	}

}
