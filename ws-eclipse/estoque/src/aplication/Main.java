package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product product = new Product();	
		System.out.println("Enter product data:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Preço: ");
		Double price = sc.nextDouble();
		System.out.print("Quantidade em Estoque: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);//ISSO É UM CONTRUTOR
		
		System.out.println();
		System.out.println("Product Data :" + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data :" + product);
		
		System.out.println();
		System.out.print("enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		//para acessar ou modificar as informações de um atributo privado é necessário chamar o metodo
		/*
		 product.setName("computer");
		 system.out.Println("atualizar produto"+ product.getName();
		 o mesmo vale para mo
		 */
		
				
		sc.close();
	}

}
