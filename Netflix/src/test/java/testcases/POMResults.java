package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pom.HomePagePOM;

public class POMResults extends CommonAPI {

    @Test(enabled = false)
    public void testTryButton() {
        HomePagePOM homePagePOM = PageFactory.initElements(driver, HomePagePOM.class);
        homePagePOM.ValidateTryButtonClickable();
        homePagePOM.ValidateTryButtonDisplayed();
    }
    @Test
    public void testFaqsButton(){
        HomePagePOM homePagePOM = PageFactory.initElements(driver, HomePagePOM.class);
        homePagePOM.ValidateFaqsDisplayed();
        homePagePOM.ValidateFaqButtonClickable();
    }
}