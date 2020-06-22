package Models;

public class Types {



public String japanese="toyota";
public String german="mercedes";
public String USA="chev";


public Types(){}


public Types(String Types) 
{
	
   this.japanese=Types;
   
}


public Types(String cars1, String cars2, String cars3)
{
	
	this.japanese="cars1";
	this.german="cars2";
	this.USA="cars3";
}	
	
	public void  getJapanese ()
	{
		
		
		System.out.println("toyota");
		
		}


public void  getGerman ()
{
	
	System.out.println("mercedes");
	
	
}

public void getUSA ()
{
	
	System.out.println("chev");
	
	
	
}




}
