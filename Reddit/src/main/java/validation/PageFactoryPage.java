package validation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

public class PageFactoryPage {

    @FindBy(xpath = "//a[contains(@href, 'https://old.reddit.com/user/dummyacct123753/')]")
    public static WebElement redditProfile;

    public void isProfileDisplayed() {
        Assert.assertEquals(redditProfile.isDisplayed(), true, "User is not logged in");
        TestLogger.log("User is logged in");
    }

    @FindBy(xpath = "//a[contains(text(), 'Calm down about the Net Neutrality thing...')]")
    public static WebElement hiddenPost;

    public void isPostHidden() {
        Assert.assertEquals(hiddenPost.isDisplayed(), true,"Post is not hidden");
        TestLogger.log("Post is hidden");
    }

    @FindBy(linkText = "Log in")
    public static WebElement loggedOut;

    public void isLoggedOut() {
        Assert.assertEquals(loggedOut.getText(), "Log in", "Link text not found");
        TestLogger.log("User is not logged in");
    }

}
