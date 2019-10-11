package homePage;

import base.CommonAPI;
import report.TestLogger;

// signe in account page
public class SigneInButton extends CommonAPI {

    public void clickOnOlineId() {
        clickOnElementByXpath("//input[@id='onlineId1']");
        TestLogger.log("Oline Id Is Clicked");
    }
    public void typeOnOlineId(){
        typeOnElementByXpath("//input[@id='onlineId1']","mesay50@bankofamerica");
        TestLogger.log("Oline Id Is Typed");
    }
    public void clickOnPassword() {
        clickOnElementByXpath("//input[@id='passcode1']");
        TestLogger.log("Password Field Is Clicked");
    }
    public void typeOnPassword(){
        typeOnElementByXpath("//input[@id='passcode1']","mesay50");
        TestLogger.log("Password Filed Is TypeAble");
    }
    public void selectOlineId(){
        isElementSelected("//input[@id='saveOnlineId']");
        TestLogger.log("Save Oline Id Filed Selected");
    }
    public void clickOnSigneInButton(){
        clickOnElementByXpath("//span[contains(text(),'Sign In')]");
        TestLogger.log("Signe In Button Is Clicked");
    }

}
