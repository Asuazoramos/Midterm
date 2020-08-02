package Ebay;

import Base.CommonAPI;
import datasources.ConnectToExcelFiles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.List;

public class EbayRunner extends CommonAPI {


     @FindBy(id ="gh-ac") public static WebElement searchBar;
     public List<WebElement> allDropDownMenu;
     @FindBy(id = "gh-p-2") public static WebElement searchBarSell;
     public List<WebElement> sell;



     public void search(String typedValueInSearch) {
          searchBar.click();
          typeOnElement(searchBar,typedValueInSearch);
     }



     public List getAllDropDownMenu(){
          return getListOfStringText(allDropDownMenu,"Drop-Down");
     }

     public void getNumberOfLinks(){
          numberOfLinks();
     }

     public String getTitle(WebDriver driver){
          return driver.getTitle();
     }

     public void searchItemsWithExcelData(){
          List<String> items;
          try {
               items = ConnectToExcelFiles.getItems();
               for (String item : items
               ) {
                    System.out.println(item);
               }
          } catch (IOException e) {
               e.printStackTrace();
          }

     }



}
