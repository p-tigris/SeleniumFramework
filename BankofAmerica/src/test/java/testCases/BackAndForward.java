package testCases;

import base.CommonAPI;
import homePage.SearchBar;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class BackAndForward extends SearchBar {

  
    @Test(enabled = false)

    public void forwardAndBackwardOnAboutUs() {
        clickAboutUs();
        navigateBack();
        navigateForward();
    }

    @Test(enabled = false)
    public void enterButtonWorks() {
        typeEnterByXpath("/html//a[@id='NAV_ABOUT_US']");
        System.out.println(getAllLinks());

    @Test
    public void enterButtonWorks() {
        typeEnterByXpath("/html//a[@id='NAV_ABOUT_US']");


    }
}
