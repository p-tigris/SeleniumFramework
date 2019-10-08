package testCases;

import homePage.ResultPage;
import homePage.SearchBar;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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

    @Test(enabled = false)
    public void getAllDropDownLocations() {
        clickAboutUs();
        clickOnCareer();
        getAllElementFromList();
    }

    @Test(enabled = false)
    public void getAllDropDownLocations1() {
        clickAboutUs();
        clickOnCareer();
        List<WebElement> elementList = getAllElementFromList();
        System.out.println(elementList.size());
        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i).getText());
        }
    }
}