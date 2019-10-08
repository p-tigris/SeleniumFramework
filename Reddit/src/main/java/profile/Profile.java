package profile;

import base.CommonAPI;

public class Profile extends CommonAPI {


    public void navToSaved() {
        clickOnElementByXpath("//a[@href='https://old.reddit.com/user/dummyacct123753/saved/']");
    }

    public void navToUpvoted() {
        clickOnElementByXpath("//a[@href='https://old.reddit.com/user/dummyacct123753/upvoted/']");
    }

    public void navToHidden() {
        clickOnElementByXpath("//a[@href='https://old.reddit.com/user/dummyacct123753/hidden/']");
    }
}
