package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import report.TestLogger;

import java.util.List;

public class SearchBar extends CommonAPI {




    public void clickSearchBar() {
        clickOnElementByXpath("//input[@id='nav-search-query']");
        TestLogger.log("Search Bar clicked");
    }

    public void typeOnSearchButton(String value) {
        typeOnElementByXpath("//input[@id='nav-search-query']", value);
        TestLogger.log(value + " :type On the Search Bar");
    }

    public void clickOnSearchButton() {
        clickOnElementByXpath("//input[@name='Search Module - Top Result – Search Button']");
        TestLogger.log("Search Button Clicked");
    }

    public void clickAboutUs() {
        clickOnElementByXpath("//a[@id='NAV_ABOUT_US']");
        TestLogger.log("About Us Is Clickable");
    }

    public void clickOnCareer() {
       clickOnElementByLinkText("Careers");
       // clickOnElementByXpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[2]/ul[1]/li[6]/a[1]");
        TestLogger.log("Career Is Clickable");
    }

    public List<WebElement> getAllElementFromList() {
        //List<WebElement> elementList = driver.findElements(By.xpath("//*[contains(@data-campus-url,'http://campus.bankofamerica.com')]"));
        //System.out.println(elementList.size());
        //return elementList;
        return driver.findElements(By.xpath("//*[contains(@data-campus-url,'http://campus.bankofamerica.com')]"));

    }



}
