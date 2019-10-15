package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import report.TestLogger;

import java.util.List;

public class DropDown extends CommonAPI {

    public void clickAboutUs() {
        clickOnElementByXpath("//a[@id='NAV_ABOUT_US']");
        TestLogger.log("About Us Is Clickable");
    }

    public void clickOnCareer() {
        clickOnElementByXpath("/html//a[@id='careers']");
        TestLogger.log("Career Is Clickable");
    }

    public void getAllElementFromList(){
        List<WebElement> elementList = driver.findElements(By.xpath("//*[contains(@data-campus-url,'http://campus.bankofamerica.com')]"));
        System.out.println(elementList.size());
 master
    }
}
