package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.TestLogger;

public class SignIn extends CommonAPI {

    @FindBy(xpath = "//input[@name='userLoginId']")
    WebElement emailTextBox;

    public void redButtonIsDisplayed(){
        isElementDisplayed("//a[@href='/login']");
    }

    public void clickOnSignInButton(){
        clickOnElementByXpath("//a[@href='/login']");
    }

    public void clickOnSignInAfterEmailAndPassword(){
        clickOnElementByXpath("//button[@class='btn login-button btn-submit btn-small']");
    }

    public void clickEmailInBar(){
        clickOnElementByXpath("//label[contains(text(),'Email or phone number')]");
        TestLogger.log("Email portion clicked");
    }
    public void typeEmailInBar(String value){
        typeOnElementByXpath("//input[@id='id_userLoginId']",value);
        TestLogger.log(value + "Email portion typed in");

    }
    public void clickPasswordBar(){
        clickOnElementByXpath("//label[contains(text(),'Password')]");
        TestLogger.log("Password portion clicked");
    }
    public void typePasswordInBar(String value){
        typeOnElementByXpath("//input[@id='id_password']",value);
        TestLogger.log(value + "Password portion typed in");
    }

    public void loginNetflix(){
        clickOnSignInButton();
        emailTextBox.sendKeys("mr.hraihan@gmail.com");
        clickPasswordBar();
        typePasswordInBar("MyFeetHurtSomeTimes");
        clickOnSignInAfterEmailAndPassword();
    }
}
