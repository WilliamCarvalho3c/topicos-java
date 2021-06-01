package calcular;

public class Area {
	public String nome;
	public double largura;
	public double altura;
	
	public double calculoArea() {
		return largura * altura; 
	}
	public double calculoPerimetro() {
		return 2*(largura * altura);
	}
	public double calculoDiagonal() {
		return Math.sqrt(largura * largura + altura * altura);
	}
	
	public String toString() {
		return nome;
				
	}
}
