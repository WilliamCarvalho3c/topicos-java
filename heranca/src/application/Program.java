package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex",0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING - Converter um objeto da subclasse para a Superclasse ou classe principal
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1002, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCAST - Converter um objeto da Superclasse para a subclasse
		
		
		BusinessAccount acc4 = (BusinessAccount)acc2;//casting manual
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if( acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			System.out.println("Emprestimo");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			System.out.println("Update");
		}
		
	}

}
