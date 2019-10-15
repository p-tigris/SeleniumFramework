package testCases;

import homePage.SearchBar;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollInTOView extends SearchBar {
    @Test

    public void scrollInToView() {
        clickAboutUs();
        WebElement element = getElement("//div[@id='lb-wrap-0']//ul/li[13]/p");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        sleepFor(10);

    }
    }
