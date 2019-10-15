package testCases;

import base.CommonAPI;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class IframeTest extends CommonAPI {

    @Test(enabled = false)

    public void iframeTest() {
        clickOnElementByXpath("//a[@id='NAV_ABOUT_US']");
        driver.switchTo().frame(0);
        sleepFor(3);
        WebElement element = getElementByxpath("//p[contains(text(),'Bank of America Named Top Global Bank on Fortune M')]");
        sleepFor(3);
        System.out.println(element.getText());
        Assert.assertEquals(element.getText(),true,"actual value is field");
    }
}
