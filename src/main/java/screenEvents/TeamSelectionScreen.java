package main.java.screenEvents;

import main.java.screenObjects.TeamSelectionElements;
import main.java.utils.Reusable;

public class TeamSelectionScreen {

    public TeamSelectionScreen clickOnMaybeLaterBtn1() {
        Reusable.getMobileElement("xpath", TeamSelectionElements.mayBeLaterBtn).click();
        return this;
    }

    public TeamSelectionScreen clickOnTorTeam() {
        Reusable.getMobileElement("xpath", TeamSelectionElements.torTeamSelection).click();
        return this;
    }

    public NeverMissAGameScreen clickOnContinueBtn2() {
        Reusable.getMobileElement("xpath", TeamSelectionElements.continueBtn2).click();
        return new NeverMissAGameScreen();
    }

}
