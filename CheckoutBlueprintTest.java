public class CheckoutBlueprintTest{
	
	public static void main(String...args){
		
		CheckoutBlueprint myCheckoutBlueprint = new CheckoutBlueprint();
		
		myCheckoutBlueprint.takePurchaseDetails();
		myCheckoutBlueprint.toCalculate();
		myCheckoutBlueprint.displayBeforeCheckout();
		myCheckoutBlueprint.printReceipt();

		
		
		
		
	}
	
	
}