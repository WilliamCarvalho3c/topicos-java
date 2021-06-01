package programa;

import java.util.Locale;
import java.util.Scanner;
import entidade.Conta;
public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;	
		System.out.print("Entre com o numero da conta: ");
		int contaBancaria= sc.nextInt();
		System.out.print("Entre com o nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Gostaria de realizar um deposito incial (y/n): ");
		char resp = sc.next().charAt(0);
		if (resp== 'y') {
			System.out.print("Entre com o deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(contaBancaria, name, depositoInicial);
		}else {
			conta = new Conta(contaBancaria, name);
		}
						
		System.out.println();		
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();		
		System.out.print("Entre com o valor do deposito:");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Saldo em conta atualizado para");
		System.out.println(conta);
		
		System.out.println();		
		System.out.print("Entre com o valor do saque:");
		double valorSaque = sc.nextDouble();
		conta.retirada(valorSaque);
		System.out.println("Saldo em conta atualizado para");
		System.out.println(conta);
		
		sc.close();

	}

}
