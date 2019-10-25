package manageprofilespack;

import base.CommonAPI;
import homepage.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import profiles.ManageProfiles;

public class ProfilesTest extends CommonAPI {
    ManageProfiles manageProfiles;
    SignIn signIn;

    public void accessProfile(){
        this.manageProfiles = PageFactory.initElements(driver, ManageProfiles.class);
        // this equals to the actual class makes connection with the class
    }
    public void accessSignIn(){
        this.signIn = PageFactory.initElements(driver, SignIn.class);
    }

    @Test
    public void validateProfiles(){
        accessSignIn();
        signIn.loginNetflix();
        accessProfile();
        manageProfiles.chooseProfile();
    }

}
