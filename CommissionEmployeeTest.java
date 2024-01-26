public class CommissionEmployeeTest{

	public static void main(String... args){
		CommissionEmployee employee = new CommissionEmployee("Dayo", "Akinyemi", "222-22-2222", 70000, .06);
		
	System.out.printf("""
		Employee Information obtained:
		
		First name is %s%n
		Last name is %s%n
		Social Security number is %s%n
		Gross Sales is %s%n
		Commission Rate is %s%n
	""", employee.getFirstName(), employee.getLastName(), employee.getSocialSecurityNumber(), employee.getGrossSales(), employee.getCommissionRate());
	
	employee.setGrossSales(50000);
	employee.setCommissionRate(.01);
	
	System.out.printf("""
		
		Updated Employee information
		
		%s
		
	""", employee);
	
	}

}