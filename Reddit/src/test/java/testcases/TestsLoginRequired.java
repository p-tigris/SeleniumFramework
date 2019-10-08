package testcases;

import homepage.HomePage;
import list.WebElementsList;
import org.testng.annotations.Test;
import profile.Profile;
import subreddit.Subreddit;
import validation.Validation;


public class TestsLoginRequired extends HomePage {

    HomePage homePage = new HomePage();
    Validation validate = new Validation();
    WebElementsList webElementsList = new WebElementsList();
    Profile profile = new Profile();
    Subreddit subreddit = new Subreddit();

    @Test(enabled = false)
    public void validateLogin() {
        validate.validateLogin();
    }

    @Test(enabled = false)
    public void validateLogout() {
        homePage.logout();
        validate.validateLogout();
    }

    @Test(enabled = false)
    public void subscribeToRJokes() {
        sleepFor(1);
        homePage.navToRJokes();
        sleepFor(5);
        clickOnElementByLinkText("join");
        sleepFor(5);
    }

    @Test(enabled = false)
    public void validateSubscribedToRJokes() {
        sleepFor(3);
        homePage.navToRJokes();
        validate.validateSubscribed("leave");
    }

    @Test(enabled = false)
    public void openLinkInNewWindow() {
        sleepFor(1);
        clickOnElementByXpath("//a[@href='https://old.reddit.com/prefs/']");
        sleepFor(3);
        clickOnElementById("newwindow");
        sleepFor(3);
        clickOnElementByXpath("//input[@type='submit']");
    }

    @Test(enabled = false)
    public void upvoteTopFunny() {
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

    @Test(enabled = false)
    public void validateUpvotedTopFunny() {
        homePage.navToProfile();
        profile.navToUpvoted();
        validate.validateUpvoted("//div[@class='arrow upmod login-required access-required']");

    }

    @Test(enabled = false)//Negative test - should not be able to submit link
    public void submitLink() {
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
    public void savePostFromPostOnRJokes() {
        sleepFor(3);
        homePage.navToRJokes();
        sleepFor(2);
        clickOnElementByXpath("//a[@href='/r/Jokes/comments/avxog7/rjokes_has_a_discord_and_you_need_to_join/']");
        clickOnElementByXpath("//*[@class='link-save-button save-button login-required']/a");
    }

    @Test(enabled = false)
    public void validateSavedPost() {
        homePage.navToProfile();
        profile.navToSaved();
        validate.validateSaved("//a[contains(@class,'title may-blank loggedin')]");
    }

    @Test(enabled = false)
    public void listOfCommentersOnRJokesPost() {
        homePage.navToProfile();
        profile.navToSaved();
        clickOnElementByXpath("//a[contains(@class,'title may-blank loggedin')]");
        webElementsList.makeListOfWebElementsText("//*[contains(@class, 'author may-blank')]");
    }

    @Test(enabled = false)
    public void userKarma() {
        homePage.navToProfile();
        webElementsList.makeListOfWebElementsText("//*[contains(@class, 'karma')]");
        webElementsList.karmaSum("//*[contains(@class, 'karma')]");
    }

    @Test
    public void hideTopPostOnRJokes() {
        sleepFor(5);
        subreddit.navToSubreddit("Jokes");
        subreddit.sortSubreddit("Jokes", "top");
        clickOnElementByXpath("//div[@role='main']//div[@class='dropdown lightdrop']/span[.='all time']");
        clickOnElementByXpath("//a[@href='/r/Jokes/comments/7ekt23/calm_down_about_the_net_neutrality_thing/']");
        clickOnElementByXpath("//div[@id='siteTable']/div[1]//ul//form[@action='/post/hide']//a[@href='javascript:void(0)']");
    }


}
