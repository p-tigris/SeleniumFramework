package testcases;

import base.CommonAPI;
import homepage.HomePage;
import list.WebElementsList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import subreddit.Subreddit;


public class TestsNoLoginRequired extends CommonAPI {

    HomePage homePage = new HomePage();
    WebElementsList webElementsList = new WebElementsList();
    Subreddit subreddit = new Subreddit();


    @Test(enabled = false)
    public void sortRWorldNewsByNew () {
        homePage.searchBox("worldnews");
        clickOnElementByLinkText("World News");
        subreddit.sortSubreddit("worldnews", "new");
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

    @Test(enabled = false)
    public void subredditsOnNavBar() {
        webElementsList.makeListOfWebElementsText("//*[contains(@class,'choice')]");
    }

    @Test(enabled = false)
    public void aboutLinks() {
        webElementsList.makeListOfWebElementsText("/html//div[@class='footer rounded']/div[1]/ul");
    }

    @Test(enabled = false) //Negative test - cannot sign up for new account because of reCAPTCHA
    public void signUpNewAccount() {
        clickOnElementByLinkText("sign up");
        sleepFor(3);
        typeOnElementById("desktop-onboarding-email", "robsmith33@gmail.com");
        sleepFor(3);
        clickOnElementByXpath("//form[@id='desktop-onboarding-sign-up-form']/button[@type='submit']");
        clickOnElementByXpath("/html//div[@id='desktop-onboarding-browse']/div[@class='desktop-onboarding-step" +
                " desktop-onboarding-step_subreddit-picker']/footer/div[@class='desktop-onboarding__buttons']/button[@class='c-btn c-btn-primary desktop-onboarding__next-button']");
        typeOnElementById("user_reg", "dummyacct345");
        typeOnElementById("passwd_reg", "password2");
        clickOnElementByXpath("/html//div[@id='desktop-onboarding-browse']/div[3]" +
                "//button[@class='c-btn c-btn-primary desktop-onboarding__next-button']");
    }

}
