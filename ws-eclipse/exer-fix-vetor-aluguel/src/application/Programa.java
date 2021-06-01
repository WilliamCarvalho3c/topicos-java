package application;

import java.util.Locale;
import java.util.Scanner;


import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		Produto[] vetor = new Produto[10];
		System.out.print("quantos quartos irão ser alugados? ");
		int n = sc.nextInt();
		
		for(int i=1;i<vetor.length; i++) {
		System.out.println();
		System.out.println("Aluguel #" + i  + ":");
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Room: ");
		int room = sc.nextInt();
		vetor[room] = new Produto(name, email, room);
		}
		System.out.println();
		System.out.println("Quartos ocupados");
		for(int i=0; i<10; i++) {
			if(vetor[i]!= null) {
		System.out.print(vetor[1]);
			}
		}
		sc.close();
	}

}
