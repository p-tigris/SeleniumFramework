package profiles;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import report.TestLogger;

public class ProfileResults extends CommonAPI {

    public void validateProfilesPageDisplayed(){
        WebElement element = getElement("//div[@id='appMountPoint']/div[@class='netflix-sans-font-loaded']/div//div[@class='bd dark-background']//a[@href='/ManageProfiles']");
        // will get the element and convert that element of the string
        Assert.assertEquals(element.isDisplayed(), true, "element is not displayed");
        // message will come if it is not displayed we need a negative message if the assert fails
        TestLogger.log("PROFILES DISPLAYED : " + element.isDisplayed());
    }

}
