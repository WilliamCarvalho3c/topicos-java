package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();// lista do tipo Employee criado no pacote entities
		System.out.print("how many employees will be registred? ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = input.nextInt();
			System.out.print("Name: ");
			input.nextLine();// consumindo o buffer - quebra de linha pendente
			String name = input.nextLine();
			System.out.print("Salary: ");
			Double salario = input.nextDouble();

			Employee emp = new Employee(id, name, salario);//criando um variavel do tipo Employee e instanciando o objeto na memoria

			list.add(emp);

		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		Integer idSalary = input.nextInt();
		
		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("this id does not exist! ");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = input.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee emp : list) {
			System.out.println(emp);
		}

		input.close();

	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getIdFuncionario() == id) {
				return i;

			}
		}
		return null;
	}
}
