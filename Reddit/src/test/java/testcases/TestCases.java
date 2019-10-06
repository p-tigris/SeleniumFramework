package testcases;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCases extends CommonAPI {

    HomePage homePage = new HomePage();

    @Test(enabled = false)
    public void subscribeToRJokes() {
        homePage.login();
        sleepFor(1);
        homePage.navToRJokes();
        sleepFor(5);
        clickOnElementByXpath("/html/body/div[3]/div[5]/div/span[1]/a[1]");
    }

    @Test(enabled = false)
    public void openLinkInNewWindow() {
        homePage.login();
        sleepFor(1);
        clickOnElementByXpath("//a[@href='https://old.reddit.com/prefs/']");
        sleepFor(3);
        clickOnElementById("newwindow");
        sleepFor(3);
        clickOnElementByXpath("//input[@type='submit']");
    }


    @Test(enabled = false)
    public void upvoteTopFunny() {
        homePage.login();
        sleepFor(3);
        typeOnElementByXpath("//input[@type='text' and @name='q']", "funny");
        clickOnElementByXpath("//input[@type='submit' and @tabindex='22']");
        clickOnElementByLinkText("funny");
        clickOnElementByXpath("//a[@href='https://old.reddit.com/r/funny/top/']");
        clickOnElementByXpath("/html/body/div[4]/div[1]/div/div[1]/span");
        clickOnElementByXpath("/html/body/div[4]/div[1]/div/div[2]/form[5]/a");
        sleepFor(2);
        clickOnElementByXpath("/html/body/div[4]/div[2]/div[31]/div[1]/div[1]");
        captureScreenshot(driver,"upvoteTopFunny_");
    }

    @Test(enabled = false)//Negative test - should not be able to submit link
    public void submitLink() {
        homePage.login();
        sleepFor(2);
        clickOnElementByXpath("//a[@href='https://old.reddit.com/submit']");
        sleepFor(2);
        typeOnElementById("url", "https://old.reddit.com");
        sleepFor(2);
        typeOnElementByXpath("//textarea[@name='title']", "This is a test case");
        sleepFor(2);
        clickOnElementById("submit_type_profile");
        sleepFor(2);
        clickOnElementByXpath("//button[@class='btn' and @name='submit']");
    }

    @Test(enabled = false)
    public void scrollToMobileWebsiteLink() {
        scrollIntoView("mobile website");
    }

    @Test(enabled = false)
    public void changeLanguage() {
        clickOnElementByLinkText("English");
        WebElement element = getElement("//select[@id='lang' and @name='lang']");
        Select select = new Select(element);

        select.selectByIndex(6);//Changes language on page to Bengali(BD)
        clickOnElementByXpath("//input[@type='submit' and @class='btn save-preferences']");
        sleepFor(5);
    }

    @Test
    public void savePostFromPostOnRJokes() {
        homePage.login();
        sleepFor(3);
        homePage.navToRJokes();
        sleepFor(2);
        clickOnElementByXpath("//a[@href='/r/Jokes/comments/avxog7/rjokes_has_a_discord_and_you_need_to_join/']");
        clickOnElementByXpath("//*[@class='link-save-button save-button login-required']/a");
    }
}
