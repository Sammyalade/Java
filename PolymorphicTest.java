public class PolymorphicTest{
	public static void main(String... args){
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
	
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-22-4444", 5000, .04, 300);
		System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ", "to superclass object", commissionEmployee.toString());
		System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ", "to superclass object", basePlusCommissionEmployee.toString());
		
		BasePlusCommissionEmployee2 basePlusCommissionEmployee2 = new BasePlusCommissionEmployee2("Damilola", "Beckley", "555-11-8387", 4000, .09, 700);
		System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ", "to superclass object", basePlusCommissionEmployee2.toString());
		
		CommissionEmployee commissionEmployee2 = new CommissionEmployee("Moyin", "Olawande", "373-47-7813", 20000, .03);
			
		System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ", "to superclass object", commissionEmployee2.toString());


	}

}