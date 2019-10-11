package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import report.TestLogger;

import java.util.ArrayList;
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
@Test
    public void clickOnCareer() {
       clickOnElementByXpath("//a[@href='http://careers.bankofamerica.com/']");
        TestLogger.log("Career Is Clickable");
    }

}
