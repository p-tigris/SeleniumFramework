package subreddit;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Subreddit extends CommonAPI {

    public void navToSubreddit(String subReddit) {
        clickOnElementByXpath("/html//div[@id='sr-header-area']//div[@class='sr-list']/ul[2]//a[@href='https://old.reddit.com/r/"+subReddit+"/']");
    }


    public void sortSubreddit(String subreddit, String sortBy) {
        clickOnElementByXpath("//a[@href='https://old.reddit.com/r/"+subreddit+"/"+sortBy+"/']");
    }
}
