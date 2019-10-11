package testCases;

import homePage.SigneInButton;
import org.testng.annotations.Test;

public class SigneInButtonTest extends SigneInButton {
    @Test
    public void SigneInButtonWorks() {
        clickOnOlineId();
        typeOnOlineId();
        clickOnPassword();
        typeOnPassword();
        selectOlineId();
        clickOnSigneInButton();
    }
}
