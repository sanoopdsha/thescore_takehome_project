package main.java.screenEvents;

import main.java.screenObjects.LandingScreenElements;
import main.java.utils.Reusable;

public class LandingScreen extends Reusable{

    public LeagueSelectionScreen clickOnGetStartedButton() {
        Reusable.getMobileElement("xpath", LandingScreenElements.getStartedBtn).click();
        return new LeagueSelectionScreen();
    }
}
