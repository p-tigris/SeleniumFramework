package testCases;

import homePage.SearchBar;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import report.TestLogger;

public class MouseHover extends SearchBar {
    @Test
    public void testMouseHover() {
        clickAboutUs();
        WebElement element = getElementByLinkText("Newsroom");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        TestLogger.log("Mouse Hover Newsroom");
        clickOnElementByLinkText("Journalist resources");
        sleepFor(3);
    }

    }

