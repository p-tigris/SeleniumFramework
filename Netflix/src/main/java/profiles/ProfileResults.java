package profiles;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import report.TestLogger;

public class ProfileResults extends CommonAPI {

    public void validateProfilesPageDisplayed(){
        WebElement element = getElement("//span[contains(text(),'Add Profile')]");
        // will get the element and convert that element of the string
        Assert.assertEquals(element.isDisplayed(), true, "element is not displayed");
        // message will come if it is not displayed we need a negative message if the assert fails
        TestLogger.log("PROFILES DISPLAYED : " + element.isDisplayed());
    }

}
