import java.util.Locale;

public class Tern {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double preco = 35.5;
		double desconto;
		
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;		
		
		System.out.println(desconto);
	}
	
}
