package list;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebElementsList extends CommonAPI {

    public void makeListOfWebElementsText(String xpath) {
        List<WebElement> elementList = driver.findElements(By.xpath(xpath));
        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i).getText());
        }
    }

    public void karmaSum(String xpath) {
        int karmaSum = 0;
        List<WebElement> elementList = driver.findElements(By.xpath(xpath));
        for (int i = 1; i < elementList.size() - 2; i++) {
            int element = Integer.parseInt(elementList.get(i).getText());
            karmaSum+=element;
        }
        System.out.println("The total sum of karma for this user is "+karmaSum);
    }
}
