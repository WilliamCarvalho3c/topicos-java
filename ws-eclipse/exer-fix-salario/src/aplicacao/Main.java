package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Salario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salario funcionario = new Salario();
		
		funcionario.nome = sc.nextLine();
		funcionario.salarioBruto = sc.nextDouble();
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + funcionario);
		System.out.println();
		System.out.println("Qual a porcentagem para aumentar o salario? ");
		double porcentagem = sc.nextDouble();
		funcionario.increaseSalario(porcentagem);
		
		System.out.println();
		System.out.println("Update data: " + funcionario);
		
		
		sc.close();

	}

}
