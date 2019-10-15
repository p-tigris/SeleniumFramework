package testCases;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    HomePage homePage =PageFactory.initElements(driver, HomePage.class);

    @Test(enabled = false)
    public void testValidateAboutUs() {
        homePage.validateaboutUsDisplayed();
    }
    @Test(enabled = false)
    public void testValidateWhoWeAre(){
        homePage.validateaboutUsDisplayed();
        homePage.validateWhoweAreDisplayed();
    }
    @Test
    public void testValidateWhatGuidesUs(){
        //homePage.validateaboutUsDisplayed();
        homePage.validateWhatGuidesUs();
    }
    @Test(enabled = false)
    public void testvalidatePartnering(){
        homePage.validateaboutUsDisplayed();
        homePage.validatePartnering();
    }
    @Test(enabled = false)
    public void testValidateNewsRoom(){
        homePage.validateaboutUsDisplayed();
        homePage.validatenewsRoom();
    }


}
