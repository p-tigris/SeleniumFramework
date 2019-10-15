package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//a[contains(@id, 'NAV_ABOUT_US')]")
    public static WebElement aboutUs;

    public void validateaboutUsDisplayed() {
        aboutUs.click();
        Assert.assertEquals(aboutUs.isDisplayed(), true, "aboutUs is not displayed");
    }

    @FindBy(xpath = "//a[@id='who-we-are']")
    public static WebElement whoweare;

    public void validateWhoweAreDisplayed() {
        whoweare.click();
        Assert.assertEquals(whoweare.isDisplayed(), true, "whoweare is not displayed");
    }

    @FindBy(xpath = "//a[@id='what-guides-us']")
    public static WebElement Whatguidesus;

    public void validateWhatGuidesUs() {
        Whatguidesus.click();
        //clickOnElementByXpath("a[@id='what-guides-us']");
        sleepFor(4);
        Assert.assertEquals(Whatguidesus.isDisplayed(), true, "Whatguidesus is not displayed");
    }

    @FindBy(how = How.XPATH, using = "/html//a[@id='partnering-locally']")
    public static WebElement partnering;

    public void validatePartnering() {
        partnering.click();
        Assert.assertEquals(partnering.isDisplayed(), true, "partnering is not displayed");
    }

    @FindBy(how = How.LINK_TEXT, using = "Newsroom")
    public static WebElement newsroom;

    public void validatenewsRoom() {
        newsroom.click();
        Assert.assertEquals(newsroom.isDisplayed(), true, "newsroom is not displayed");
    }
//    public void clickAboutUs(){
//        clickOnElementByXpath("//a[@id='NAV_ABOUT_US']");
//    }
}

