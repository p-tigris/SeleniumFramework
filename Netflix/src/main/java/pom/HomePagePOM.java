package pom;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePagePOM extends CommonAPI {

    @FindBy(xpath ="//div[@class='our-story-card faq-card']//span[@class='hero-cta-btn-txt'][contains(text(),'TRY 30 DAYS FREE')]")
    public static WebElement TryButton;

    public void ValidateTryButtonDisplayed(){
        Assert.assertEquals(TryButton.isDisplayed(),true);
    }
    public void ValidateTryButtonClickable(){
        TryButton.click();
        Assert.assertEquals(TryButton.isDisplayed(),true);
    }
    @FindBy(xpath = "//span[contains(text(),'FAQ')]")
    public WebElement faqs;

    public void ValidateFaqsDisplayed(){
        Assert.assertEquals(faqs.isDisplayed(),true);
    }
//    public void ValidateFaqButtonClickable(){
//        faqs.click();
//        Assert.assertEquals(faqs.isDisplayed(),true);
//    }
}

