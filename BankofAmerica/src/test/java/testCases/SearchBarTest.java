package testCases;

import homePage.ResultPage;
import homePage.SearchBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SearchBarTest extends SearchBar {

    ResultPage resultPage = new ResultPage();

    @Test
    public void clickOnCareer() {
        clickAboutUs();
        clickOnCareer();
    }

    @Test(enabled = false)
    public void validateSearchButtonWork() {
        clickSearchBar();
        typeOnSearchButton("mobile banking");
        clickOnSearchButton();
        resultPage.validateResultPageDisplyed();
    }

}