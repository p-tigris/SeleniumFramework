package testcases;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import profile.Profile;
import validation.PageFactoryPage;

public class PageFactoryTest extends CommonAPI {

    PageFactoryPage pageFactory;
    HomePage homePage = new HomePage();
    Profile profile = new Profile();

    @BeforeMethod
    public void setPageFactory() {
        pageFactory = PageFactory.initElements(driver, PageFactoryPage.class);
    }

    @Test
    public void testLoggedInUsingPageFactory() {
        homePage.login();
        pageFactory.isProfileDisplayed();
    }

    @Test
    public void testLoggedOutUsingPageFactory() {
        pageFactory.isLoggedOut();
    }

    @Test
    public void testPostHiddenUsingPageFactory() {
        homePage.login();
        homePage.navToProfile();
        profile.navToHidden();
        pageFactory.isPostHidden();
    }

}
