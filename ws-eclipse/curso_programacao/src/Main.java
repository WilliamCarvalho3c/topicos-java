/*import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		int y =32;
		double x = 10.35784;
		double resultado = y * x;
		String nome = "William Carvalho coelho";
		int idade = 29;
		double renda = 5000.0;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);//%.2f para formatar casa decimais
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);//configuração de virgula para o ponto
		System.out.printf("%.4f%n", x);
		System.out.println("o Resultado de "+ x +" mutiplicado  por " +y + " é igual à "+ resultado );
		System.out.printf("o Resultado é %.2f%n", x);
		System.out.printf("%s Tem %d anos e ganha R$ %.2f reais%n",nome, idade, renda);//%s= stringa %d = 
	}

}*/

import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		String product1 = "Computador";
		String product2 = "Mesa de computador";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: %s, which price is  %s%n",product1,price1 );
		System.out.printf("%s, wich price is %s%n",product2,price2 );
		System.out.printf("Record: %s years old, code %s and gender: %s%n",age, code, gender);
		System.out.printf("Measure with eight decimal places: %s%n%n", measure);
		System.out.printf("Rouded (three decimal places): %s%n ", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %s%n",measure );
	}

}

