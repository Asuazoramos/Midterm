package Singleton;
public class Microsoft 
{
	
	
	
	
	private static Microsoft microsoft = getMicrosoft();
	private Microsoft (Microsoft microsoft) {
         Microsoft.microsoft = microsoft;	
		
	}
	
	
	public static Microsoft getMicrosoft ()
	{
		
		return microsoft;
		
		
	}
	
	
	public static void connectMicrosoft()
	{
		
		System.out.println("The new microsoft computer");
		
	}
	
	
	
	




}



























