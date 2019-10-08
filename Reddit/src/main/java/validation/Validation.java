package validation;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import report.TestLogger;

public class Validation extends CommonAPI {

    public void validateLogin() {
        WebElement element = getElement("//a[@href='https://old.reddit.com/user/dummyacct123753/']");
        Assert.assertEquals(element.isDisplayed(), true,"User has not logged in");
        TestLogger.log("Login status: " + element.isDisplayed());
    }

    public void validateLogout() {
        WebElement loggedOut = getElementByLinkText("Log in");
        Assert.assertEquals(loggedOut.isDisplayed(),true,"User has not logged out");
        TestLogger.log("Logout status: " + loggedOut.isDisplayed());
    }
    public void validateSubscribed(String linkText) {
        WebElement joinButton = getElementByLinkText(linkText);
        Assert.assertEquals(joinButton.isDisplayed(), true, "User is not subscribed");
        TestLogger.log("Subscriber status: " + joinButton.isDisplayed());
    }

    public void validateSaved(String xpath) {
        Assert.assertEquals(isElementDisplayed(xpath), true, "Post is not saved");
        TestLogger.log("Save status: " + isElementDisplayed(xpath));
    }

    public void validateUpvoted(String xpath) {
        Assert.assertEquals(isElementDisplayed(xpath), true,"Post is not upvoted");
        TestLogger.log("Upvoted status: " +isElementDisplayed(xpath));
    }

}
