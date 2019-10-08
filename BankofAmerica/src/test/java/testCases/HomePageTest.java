package testCases;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

    @Test
    public void testWhoWeAre() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateaboutUsDisplayed();
        homePage.validateaboutUsClickable();
    }


}
