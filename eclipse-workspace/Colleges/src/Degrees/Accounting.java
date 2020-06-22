package Degrees;

public class Accounting {

public String Associate ="first degree";
public String Bachelors ="secong degree";
public String master = "third degree";


public Accounting(){}	
  

public Accounting(String Accounting){
	
	this.Associate=Accounting;
	
}


public Accounting(String class1, String class2,String class3) 
{
	
	this.Associate=class1;
	this.Bachelors=class2;
	this.master=class3;
	
	
}


public void getAssociate ()
{
	
	
	System.out.println(Associate);
	
}

public void getBachelors ()
{
	
	
	System.out.println(Bachelors);
	
	
}

public void getMaster ()
{
	
	System.out.println(master);
	
	
	
	
}












}
