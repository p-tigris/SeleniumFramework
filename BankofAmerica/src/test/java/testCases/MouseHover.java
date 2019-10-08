package testCases;

import homePage.SearchBar;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import report.TestLogger;

public class MouseHover extends SearchBar {
    @Test(enabled = false)
    public void testMouseHover() {
        clickAboutUs();
        WebElement element = getElementByLinkText("Newsroom");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        TestLogger.log("Mouse Hover Newsroom");
        clickOnElementByLinkText("Journalist resources");
        sleepFor(3);
    }

    @Test
    public void scrollInToView() {
        clickAboutUs();
        WebElement element = getElement("//div[@id='lb-wrap-0']//ul/li[13]/p");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        sleepFor(10);

    }
}
