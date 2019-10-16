package testcases;

import homepage.SignIn;
import manageprofilespack.ProfilesTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import profiles.ProfileResults;

public class SignInTest extends SignIn {
    ProfileResults profileResults;

    public void accessProfileResults(){
        this.profileResults = PageFactory.initElements(driver, ProfileResults.class);
    }
    @Test
    public void validateSignInButton(){
        redButtonIsDisplayed();
        clickOnSignInButton();
        clickEmailInBar();
        typeEmailInBar("mr.hraihan@gmail.com");
        clickPasswordBar();
        typePasswordInBar("181WhyNot!");
        clickOnSignInAfterEmailAndPassword();
        accessProfileResults();
        profileResults.validateProfilesPageDisplayed();

        //profileResults.validateProfilesPageDisplayed();
    }

}
