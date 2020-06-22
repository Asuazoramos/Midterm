package Countries;

public class Capital {
	
	
	public String spain = "madrid";
	public String germany = "london";
	public String mexico = "mexico city";
			
	public Capital() {}
	
	
	public Capital(String Capital) {
		this.spain=Capital;
		
		
	}
	
	public Capital(String Capital1, String Capital2, String Capital3)
	{
		
		this.spain=Capital1;
		this.germany=Capital2;
		this.mexico=Capital3;
		
	}
	
	
	
	public void getSpain ()
	
	{
	System.out.println(spain);
	}
	
	public void getGermany ()
	{
		System.out.println(germany);
	
	}
	
	public void getMexico ()
	{
		
		System.out.println(mexico);
		
		
	}
	
	


}

















