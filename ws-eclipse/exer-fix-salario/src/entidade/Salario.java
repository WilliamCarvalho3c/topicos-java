package entidade;

public class Salario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double netSalario(){
		return salarioBruto - imposto ;
	}
	public void increaseSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem/100.0;
	}
	public String toString() { 
		return nome +", $ " + String.format("%.2f", netSalario());
	}
}
