package testcases;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestCases extends CommonAPI {

    @Test
    public void login() {
        clickOnElementByXpath("//a[@href='https://www.reddit.com/login' and @class='login-required login-link']");
        typeOnElementById("user_login", "dummyacct123753");
        typeOnElementById("passwd_login", "password2");
        clickOnElementByXpath("//button[@type='submit' and @tabindex='3']");
    }

    @Test
    public void subscribeToRJokes() {
        login();
        sleepFor(1);
        clickOnElementByXpath("//*[@id='sr-header-area']/div/div[1]/span");
        sleepFor(1);
        clickOnElementByXpath("//a[@href='https://old.reddit.com/subreddits/' and @class='bottom-option choice']");
        typeOnElementByXpath("//input[@type='text' and @name='q']", "jokes");
        clickOnElementByXpath("//input[@type='submit' and @tabindex='22']");
        sleepFor(3);
        clickOnElementByLinkText("r/Jokes: Jokes: Get Your Funny On!");
        sleepFor(5);
        clickOnElementByXpath("/html/body/div[3]/div[5]/div/span[1]/a[1]");
    }

    @Test
    public void openLinkInNewWindow() {
        login();
        sleepFor(1);
        clickOnElementByXpath("//a[@href='https://old.reddit.com/prefs/']");
        sleepFor(3);
        clickOnElementById("newwindow");
        sleepFor(3);
        clickOnElementByXpath("//input[@type='submit']");
    }


    @Test
    public void upvoteTopFunny() {
        login();
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

    @Test//Negative test - should not be able to submit link
    public void submitLink() {
        login();
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


}
