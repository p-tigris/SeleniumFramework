package homepage;

import base.CommonAPI;

public class HomePage extends CommonAPI {

    public void login() {
        clickOnElementByXpath("//a[@href='https://www.reddit.com/login' and @class='login-required login-link']");
        typeOnElementById("user_login", "dummyacct123753");
        typeOnElementById("passwd_login", "password2");
        clickOnElementByXpath("//button[@type='submit' and @tabindex='3']");
    }

    public void navToRJokes() {
        clickOnElementByXpath("//*[@id='sr-header-area']/div/div[1]/span");
        sleepFor(1);
        clickOnElementByXpath("//a[@href='https://old.reddit.com/subreddits/' and @class='bottom-option choice']");
        typeOnElementByXpath("//input[@type='text' and @name='q']", "jokes");
        clickOnElementByXpath("//input[@type='submit' and @tabindex='22']");
        sleepFor(3);
        clickOnElementByLinkText("r/Jokes: Jokes: Get Your Funny On!");
    }

}
