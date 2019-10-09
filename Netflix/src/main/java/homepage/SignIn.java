package homepage;

import base.CommonAPI;

public class SignIn extends CommonAPI {

    public void redButtonIsDisplayed(){
        isElementDisplayed("//a[@href='/login']");
    }

    public void clickOnSignInButton(){
        clickOnElementByXpath("//a[@href='/login']");
    }
}
