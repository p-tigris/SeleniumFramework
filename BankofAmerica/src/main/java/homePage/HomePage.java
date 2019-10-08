package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage extends CommonAPI {
   WebElement aboutUs=getElement("/html//a[@id='NAV_ABOUT_US']");
    WebElement Ourcompany=getElement("Our company");

    @FindBy(xpath = "/html//a[@id='who-we-are']")
    public static WebElement whoWeAre;

    @FindBy(xpath = "/html//a[@id='what-guides-us']")
    public static WebElement whatGuidesUs;

    @FindBy(linkText = "Partnering locally")
    public static WebElement partneringLocally;

    @FindBy(how = How.XPATH, using = "/html//a[@id='newsroom']")
    public static WebElement newsRoom;

    @FindBy(how = How.XPATH, using = "/html//a[@id='investor-relations']")
    public static WebElement investorRelations;

    @FindBy(how = How.LINK_TEXT, using = "Careers")
    public static WebElement careers;
    public  void validateaboutUsDisplayed(){
        Assert.assertEquals(aboutUs.isDisplayed(),true,"aboutUs is Failed");
    }
    public void validateaboutUsClickable(){
        aboutUs.click();
        Assert.assertEquals(Ourcompany.isDisplayed(),true,"Our Company is failed");
    }

    }

