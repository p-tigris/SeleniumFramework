
package testCases;

import homePage.DropDown;
import homePage.SearchBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class DropDownTest extends DropDown {

    // print list out all element in side drop down
    @Test(enabled = false)
    public void getAllDropDownLocations() {
        //clickAboutUs();
        //clickOnCareer();
        getAllElementFromList();

    }
    // print all the text and stored all the text inside arrayList
    @Test
    public void getAllDropDownLocations1() {
        //clickAboutUs();
        //clickOnCareer();
        List<WebElement> elementList = driver.findElements(By.xpath("//*[contains(@data-campus-url,'http://campus.bankofamerica.com')]"));
       // print all the text
        for (int i= 0; i<elementList.size();i++) {
            System.out.println(elementList.get(i).getText());
        }
        // store all the text inside arrayList
        List<String> stringList = new ArrayList<String>();
        for (int i= 0; i<elementList.size();i++) {
            stringList.add(elementList.get(i).getText());
        }


    }


    @Test(enabled = false)
    public void testDropDown() {
        //clickAboutUs();
       // clickOnCareer();
        WebElement element = getElement("//select[@id='sel-country-list']");
        Select select = new Select(element);
        System.out.println(element);
        select.selectByIndex(5);
    }
}