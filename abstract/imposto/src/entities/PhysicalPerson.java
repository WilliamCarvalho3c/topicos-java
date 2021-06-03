package entities;

public class PhysicalPerson extends People{
	private double healthExpense;
	
	public PhysicalPerson() {
		
	}

	public PhysicalPerson(String name, Double annualIncome, double healthExpense) {
		super(name, annualIncome);
		this.healthExpense = healthExpense;
	}

	public double getHealthExpense() {
		return healthExpense;
	}

	public void setHealthExpense(double healthExpense) {
		this.healthExpense = healthExpense;
	}

	@Override
	public double tax() {
		double basicTax;
		if(getAnnualIncome() < 20000.0) {
			basicTax = getAnnualIncome() * 0.15;
		}
		else {
			basicTax = getAnnualIncome() * 0.25;
		}
		basicTax -= getHealthExpense() * 0.5;
		if(basicTax < 0.0) {
			return 0.0;
		}
		return basicTax;
	}
	
	
	
}
