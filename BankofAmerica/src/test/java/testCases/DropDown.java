
package testCases;

import homePage.SearchBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class DropDown extends SearchBar {
    @Test
    public void testDropDown() {
        clickAboutUs();
        sleepFor(3);
        clickOnCareer();
        sleepFor(2);
        WebElement element = getElement("//select[@id='sel-country-list']");
        Select select = new Select(element);
        select.selectByIndex(5);
    }
}