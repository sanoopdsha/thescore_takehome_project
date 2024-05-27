package main.java.screenEvents;

import main.java.screenObjects.NeverMissAGameElements;
import main.java.utils.Reusable;

public class NeverMissAGameScreen {

    public TheScoreMessagingScreen clickOnDoneBtn() {
        Reusable.getMobileElement("xpath", NeverMissAGameElements.doneBtn).click();
        return new TheScoreMessagingScreen();
    }
}
