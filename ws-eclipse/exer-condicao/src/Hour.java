import java.util.Scanner;

public class Hour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal;
		
		System.out.println("Digita a hora inicial");
		horaInicial =sc.nextInt();
		System.out.println("Digite a hora final");
		horaFinal = sc.nextInt();
				
		int duracao;
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA (S) ");
		
		
		
		
		
		sc.close();
	}

}
