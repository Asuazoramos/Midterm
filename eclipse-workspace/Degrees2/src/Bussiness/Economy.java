package Bussiness;

public class Economy {

public String Dollars ="American";
public String CanadianDollars ="canada";
public String MexicoPeso ="pesos";

public Economy(){}

public Economy(String Economy) {
	
	this.Dollars=Economy;
	
	
}

public Economy(String Spend1, String Spend2, String Spend3)
{
	
	this.Dollars=Spend1;
	this.CanadianDollars=Spend2;
	this.MexicoPeso=Spend3;
	
}
	public void getDollars ()
	{
		
		System.out.println("American");
		
	
	
	}
	
	public void getCanadianDollars ()
	
	{
		
		System.out.println("Canada");
			
		
	}


public void getMexicoPeso ()
{
	
	System.out.println("peso");
	
	
	
	
	
	
}



















}
