package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.People;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<People>list = new ArrayList<People>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();		
		for(int i=1; i<=n; i++) {
			System.out.print("Tax payer #" + n + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double annualIncome = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpense = sc.nextDouble();
				list.add(new PhysicalPerson(name, annualIncome, healthExpense));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new LegalPerson(name, annualIncome, numberOfEmployees ));
			}	
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for(People ps : list) {
			System.out.println(ps.getName() +" : $ " + String.format("%.2f", ps.tax()));
		}
		double sum = 0.0;
		for(People ps : list) {
			sum += ps.tax();
		}
		System.out.println("TOTAL TAXES: $ "+ String.format("%.2f", sum));
		System.out.println();
		
		
		
		sc.close();
	}

}
