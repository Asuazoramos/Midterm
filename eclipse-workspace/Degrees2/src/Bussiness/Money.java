package Bussiness;

public class Money {




public static void main(String[] args) {

	

String Spend1 ="American";
String Spend2 ="CanadianDollars";
String Spend3 ="Peso";

Economy Economy = new Economy(Spend1,Spend2,Spend3);




Economy.getDollars();
Economy.getCanadianDollars();
Economy.getMexicoPeso();

}

}
