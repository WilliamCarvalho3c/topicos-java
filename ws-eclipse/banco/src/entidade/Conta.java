package entidade;

public class Conta{
	private  int contaBancaria;
	private  String name;
	private  double saldo;
	
	public Conta(int contaBancaria, String name) {
		this.name = name;
		this.contaBancaria = contaBancaria;
	}
	public Conta(int contaBancaria, String name, double depositoInicial) {
		this.contaBancaria = contaBancaria;
		this.name = name;
		deposito(depositoInicial);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContaBancaria() {
		return contaBancaria;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double amount) {
		saldo += amount ;
	}
	public void retirada(double amount) {
		saldo -= amount +5.0;
	}
	
	public String toString() {
		return "Conta "
				+contaBancaria
				+",nome: "
				+name
				+", Saldo: $ "
				+ String.format("%.2f", saldo);
	}

	
		
}
