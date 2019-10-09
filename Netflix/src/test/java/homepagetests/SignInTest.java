package homepagetests;

import homepage.SignIn;
import org.testng.annotations.Test;

public class SignInTest extends SignIn {

    @Test
    public void validateSignInButton(){
        redButtonIsDisplayed();
        clickOnSignInButton();
    }
}
