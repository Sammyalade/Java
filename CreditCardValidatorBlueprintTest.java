public class CreditCardValidatorBlueprintTest{

	public static void main(String... args){
	
		CreditCardValidatorBlueprint myCreditCardValidatorBlueprint = new CreditCardValidatorBlueprint();
	
		myCreditCardValidatorBlueprint.takeAndSeperateCardNumber();
		myCreditCardValidatorBlueprint.checkCardType();
		myCreditCardValidatorBlueprint.checkCardValidity();
		myCreditCardValidatorBlueprint.displayCardStatus();
	
	
	}	

}