package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import report.TestLogger;

public class ResultPage extends CommonAPI {

    public void validateResultPageDisplyed() {
        WebElement element=getElement("//p[@class='results-heading']");
        // boolean obj = isElementDisplayed("//h3[@class='answer-heading']");
        Assert.assertEquals(element.isDisplayed(), true, "elment isn't displyed");
        TestLogger.log("Search Result Panel is: "+ element.isDisplayed());
    }
}

