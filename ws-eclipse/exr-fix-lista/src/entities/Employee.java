package entities;

public class Employee {
	private Integer idFuncionario;
	private String name;
	private Double salario;
	
	
	public Employee() {
		super();
	}
	public Employee(Integer idFuncionario, String name, Double salario) {
		this.idFuncionario = idFuncionario;
		this.name = name;
		this.salario = salario;
	}
	public Integer getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalario() {
		return salario;
	}
	
	public void increaseSalary(double percentage) {
		salario += salario * percentage / 100.0;
	}
	
	@Override
	public String toString() {
		return idFuncionario + ", " +name + ", "+ String.format("%.2f", salario);
	}
}
