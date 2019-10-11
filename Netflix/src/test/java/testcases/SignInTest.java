package testcases;

import homepage.SignIn;
import manageprofilespack.ProfilesTest;
import org.testng.annotations.Test;
import profiles.ProfileResults;

public class SignInTest extends SignIn {
    ProfileResults profileResults;
    @Test
    public void validateSignInButton(){
        redButtonIsDisplayed();
        clickOnSignInButton();
        clickEmailInBar();
        typeEmailInBar("mr.hraihan@gmail.com");
        clickPasswordBar();
        typePasswordInBar("181WhyNot!");
        clickOnSignInAfterEmailAndPassword();

        //profileResults.validateProfilesPageDisplayed();
    }

}
