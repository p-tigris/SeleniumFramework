package profiles;

import base.CommonAPI;
import report.TestLogger;

public class ManageProfiles extends CommonAPI {

    public void chooseProfile(){
        clickOnElementByXpath("//li[1]//div[1]//a[1]//div[1]//div[1]");
        TestLogger.log("Hisham's Profile Chosen");
    }
}
