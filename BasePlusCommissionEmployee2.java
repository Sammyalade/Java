public class BasePlusCommissionEmployee2 extends CommissionEmployee{

	private double baseSalary;
	
	public BasePlusCommissionEmployee2(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		if(baseSalary < 0.0){
			throw new IllegalArgumentException("Base Salary must be greater than 0.0");
		}
		this.baseSalary = baseSalary;
	}
	
	public void setBaseSalary(double baseSalary){
		if(baseSalary < 0.0){
			throw new IllegalArgumentException("Base Salary must be greater than 0.0");
		}
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary(){ 
		return baseSalary; 
	}
	
	@Override
	public double earnings(){
		return baseSalary + super.earnings(); 
	}
	@Override
	public String toString(){
		return String.format("\t%s: %s %s%n\t%s: %s%n\t%s: %.2f%n\t%s: %.2f%n\t%s: %.2f", "Base-Salaried Commission Employee", getFirstName(), getLastName(), "Social Security Number", getSocialSecurityNumber(), "Gross Sales", getGrossSales(), "Commission Rate", getCommissionRate(),"Base Salary", baseSalary);
	}

}