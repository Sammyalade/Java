public class PetrolPurchase{
	private String stationLocation;
	private String typeOfPetrol;
	private int purchasesInLiters;
	private double pricePerLiter;
	private double percentageDiscount;
	private double purchaseAmount;

	public PetrolPurchase(String stationLocation, String typeOfPetrol, int purchasesInLiters, double pricePerLiter, double percentageDiscount){
	this.stationLocation = stationLocation;
	
	this.typeOfPetrol = typeOfPetrol;
	
	if (purchasesInLiters > 0)
	this.purchasesInLiters = purchasesInLiters;
	
	this.pricePerLiter = pricePerLiter;
	
	this.percentageDiscount = percentageDiscount;
	}

	public void setStationLocation(String stationLocation){
	this.stationLocation = stationLocation;
	}

	public String getStationLocation(){
	return stationLocation;	
	}
	
	public void setTypeOfPetrol(String typeOfPetrol){
	this.typeOfPetrol = typeOfPetrol;
	}

	public String getTypeOfPetrol(){
	return typeOfPetrol;	
	}

	public void setPurchasesInLiters(int purchasesInLiters){
	this.purchasesInLiters = purchasesInLiters;
	}

	public int getPurchasesInLiters(){
	return purchasesInLiters;	
	}

	public void setPricePerLiter(double pricePerLiter){
	this.pricePerLiter = pricePerLiter;
	}

	public double getPricePerLiter(){
	return pricePerLiter;	
	}

	public void setPercentageDiscount(double percentageDiscount){
	this.percentageDiscount = percentageDiscount;
	}

	public double getPercentageDiscount(){
	return percentageDiscount;	
	}

	public void purchaseAmount(double purchasesInLiters){
		if (purchasesInLiters > 0){
		   
		   purchaseAmount = (purchasesInLiters * pricePerLiter) - ((purchasesInLiters * pricePerLiter) * percentageDiscount);
		}
	}
	public double getPurchaseAmount(){
	return purchaseAmount;
	}

	

	

}

	