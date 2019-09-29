package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver;

    public static WebDriver getLocalDriver(String browser, String platform) {
        //chrome popup
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");

        if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "../Generic/src/main/resources/chromedriver");
            driver = new ChromeDriver(chromeOptions);
        } else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "../Generic/src/main/resources/chromedriver.exe");
            driver = new ChromeDriver(chromeOptions);
        } else if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "../Generic/src/main/resources/geckodriver");
            driver = new FirefoxDriver();
        } else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "../Generic/src/main/resources/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

    public static WebDriver getCloudDriver() {
        return driver;
    }

    @Parameters({"platform", "url", "browser", "cloud", "browserVersion", "envName"})
    @BeforeMethod
    public static WebDriver setupDriver(String platform, String url, String browser, boolean cloud,
                                        String broswerVersion, String envName) {
        if (cloud == true) {
            driver = getCloudDriver();
        } else {
            driver = getLocalDriver(browser, platform);
        }
        driver.get(url);
        return driver;
    }

    public void sleepFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
        driver.quit();
    }

    public void clickOnElementByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void clickOnElementById(String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void sendKeysByXpath(String locator, String keys) {
        driver.findElement(By.xpath(locator)).sendKeys(keys);
    }

    public void sendKeysById(String locator, String keys) {
        driver.findElement(By.id(locator)).sendKeys(keys);
    }

    public void sendKeysByClass(String locator, String keys) {
        driver.findElement(By.className(locator)).sendKeys(keys);
    }

    public void sendKeysByCSS(String locator, String keys) {
        driver.findElement(By.cssSelector(locator)).sendKeys(keys);
    }

    public void sendKeysByLinkText(String locator, String keys) {
        driver.findElement(By.linkText(locator)).sendKeys(keys);
    }

    public void sendKeysByPartialLinkText(String locator, String keys) {
        driver.findElement(By.partialLinkText(locator)).sendKeys(keys);
    }

    public void clickOnElementByClass(String locator) {
        driver.findElement(By.className(locator)).click();
    }

    public void clickOnElementByCSS(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void clickOnElementByLinkText(String locator) {
        driver.findElement(By.linkText(locator)).click();
    }

    public void clickonElementByPartialLinkText(String locator) {
        driver.findElement(By.partialLinkText(locator)).click();
    }

    public String getValueByXpath(String locator) {
        return driver.findElement(By.xpath(locator)).getText();
    }

    public boolean isElementDisplayed(String locator) {
        return driver.findElement(By.xpath(locator)).isDisplayed();
    }

    public boolean isElementEnabled(String locator) {
        return driver.findElement(By.xpath(locator)).isEnabled();
    }

    public boolean isElementSelected(String locator) {
        return driver.findElement(By.xpath(locator)).isSelected();
    }

    public WebElement getElement(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        return element;
    }

    public static void captureScreenshot(String screenshotName) {
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/"
                    + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (IOException e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
            ;
        }
    }
}
