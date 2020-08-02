package EbayTestRunner;

import Base.CommonAPI;
import Ebay.EbayRunner;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.apache.xmlbeans.XmlBeans.getTitle;

public class EbayTest extends CommonAPI {
    EbayRunner ebayRunner;

    @BeforeMethod
    public void initializePageObjects(){

       ebayRunner = PageFactory.initElements(driver,EbayRunner.class);
    }

    @Test
    public void getAllDropDownMenuTest() {
        List<String> dropDownMenu = ebayRunner.getAllDropDownMenu();

        if(dropDownMenu.size() == 0){
            Assert.fail("nothing was found in dropdown or wrong locator is being used");
        }

        String lastDropDownText = dropDownMenu.get(dropDownMenu.size() - 1);
        System.out.println("The last Drop-Down text is: " + lastDropDownText);
        Assert.assertTrue(lastDropDownText.equalsIgnoreCase("more"));
    }

    @Test
    public void getTitleTest() {
        String expectedTitle = "org.apache.xmlbeans";
        String actualTitle = getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @Test
    public void typeSearchBox() {
        search("apple watch");
        //String expectedInnerHTML = "\"" + HomePage.typedValueInSearch + "\"";
        //Assert.assertEquals(expectedInnerHTML, innerHTML);
    }
    @Test
    public void searchBox(){
        search("computers");
    }

    public void search(String booking) {
    }

    @Test
    public void searchItemsWithExcelDataTest(){
        ebayRunner.searchItemsWithExcelData();

    }




    @Test
    public void totalLinks() {
        ebayRunner.getNumberOfLinks();
    }

    @Test
    public void SearchBarSell(){

    }

}
