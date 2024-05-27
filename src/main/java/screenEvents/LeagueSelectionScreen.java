package main.java.screenEvents;

import main.java.screenObjects.LeagueScreenElements;
import main.java.utils.Reusable;
import org.junit.Assert;

public class LeagueSelectionScreen {


    public LeagueSelectionScreen clickOnNhlHockey() {
        Reusable.getMobileElement("xpath", LeagueScreenElements.nhlHockeySelection).click();
        return this;
    }

    public LeagueSelectionScreen verifyingNhlTextDisplayed() {
        String expectedText = "NHL";
        String actualText = Reusable.getMobileElement("xpath", LeagueScreenElements.nhlLabelText).getText();
        Assert.assertEquals(actualText, expectedText);
        return this;
    }

    public TeamSelectionScreen clickOnContinueBtn1() {
        Reusable.getMobileElement("xpath", LeagueScreenElements.continueBtn1).click();
        return new TeamSelectionScreen();
    }


}



