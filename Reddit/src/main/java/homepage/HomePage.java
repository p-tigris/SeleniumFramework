package homepage;

import base.CommonAPI;
import org.testng.annotations.BeforeMethod;

public class HomePage extends CommonAPI {


    @BeforeMethod
    public void login() { //Logs in to a dummy account
        clickOnElementByXpath("//a[@href='https://www.reddit.com/login' and @class='login-required login-link']");
        typeOnElementById("user_login", "dummyacct123753");
        typeOnElementById("passwd_login", "password2");
        clickOnElementByXpath("//button[@type='submit' and @tabindex='3']");
    }

    public void logout() {
        clickOnElementByLinkText("logout");
    }
    public void navToProfile() {
        clickOnElementByXpath("//a[@href='https://old.reddit.com/user/dummyacct123753/']");
    }

    public void navToRJokes() { //Navigates to r/Jokes subreddit
        clickOnElementByXpath("//*[@id='sr-header-area']/div/div[1]/span");
        sleepFor(1);
        clickOnElementByXpath("//a[@href='https://old.reddit.com/subreddits/' and @class='bottom-option choice']");
        typeOnElementByXpath("//input[@type='text' and @name='q']", "jokes");
        clickOnElementByXpath("//input[@type='submit' and @tabindex='22']");
        sleepFor(3);
        clickOnElementByLinkText("r/Jokes: Jokes: Get Your Funny On!");
    }

    public void searchBox(String value) {
        typeOnElementByXpath("//input[@type='text' and @name='q']", value);
        clickOnElementByXpath("//input[@type='submit' and @tabindex='22']");
    }

}
