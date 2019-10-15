package profiles;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.TestLogger;

public class ManageProfiles extends CommonAPI {

    @FindBy(xpath = "//li[1]//div[1]//a[1]//div[1]//div[1]")
    WebElement hishamsProfile;

    public void getHishamsProfile(){
        this.hishamsProfile.click();
    }

    public void chooseProfile(){
        getHishamsProfile();
        TestLogger.log("Hisham's Profile Chosen");
    }
}
