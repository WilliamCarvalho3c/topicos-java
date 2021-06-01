package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String[] vect = new String[] {"Maria", "Bob","Alex"};
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		for (String obj : vect) {//no for each chamamos pelo nome do objeto com a declaração da tipo da classe
			System.out.println(obj);//leitura para cada objeto 'obj' contido no vetor vect[i] faça
		}
		
		
		sc.close();
	}

}
