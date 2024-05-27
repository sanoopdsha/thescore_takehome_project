package main.java.screenEvents;

import main.java.screenObjects.TheScoreMessagingElements;
import main.java.utils.Reusable;

public class TheScoreMessagingScreen {

    public TeamsPlayerAndNewsScreen clickOnMayBeLaterBtn2() {
        Reusable.getMobileElement("xpath", TheScoreMessagingElements.mayBeLaterBtn2).click();
        return new TeamsPlayerAndNewsScreen();
    }
}
