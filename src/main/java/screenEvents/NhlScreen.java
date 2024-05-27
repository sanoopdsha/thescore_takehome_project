package main.java.screenEvents;

import main.java.screenObjects.NhlElements;
import main.java.screenObjects.TeamsPlayerAndNewsElements;
import main.java.utils.Reusable;
import org.junit.Assert;

public class NhlScreen {

    public NhlScreen verifyingNhlPageTitle() {
        //2.Verify that the expected page opens correctly.
        String expectedPageName = "NHL";
        String actualPageName = Reusable.getMobileElement("xpath", NhlElements.NhlText).getText();
        Assert.assertEquals(actualPageName, expectedPageName);
        return this;
    }

    public NhlScreen clickingOnLeadersTab() {
        Reusable.getMobileElement("xpath", NhlElements.leaderTab).click();
        return this;
    }

    public NhlScreen verifyingLeaderTabTitle() {
        String expectedTitle = "LEADERS";
        String actualTitle = Reusable.getMobileElement("xpath", NhlElements.leaderTab).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        return this;
    }

    public NhlScreen verifyDataForLeagueDisplayedCorrectly() {
        String expectedLeague = "NHL";
        ;
        String actualLeague = Reusable.getMobileElement("xpath", NhlElements.NhlText).getText();
        Assert.assertEquals(actualLeague, expectedLeague);
        return this;
    }

    public TeamsPlayerAndNewsScreen verifyBackNavigationReturnsToPreviousPage() {
        Reusable.getMobileElement("xpath", NhlElements.backNavigation).click();
        String expectedPage = "Teams, Players, and News";
        String actualPage = Reusable.getMobileElement("xpath", TeamsPlayerAndNewsElements.pageTitleText).getText();
        Assert.assertEquals(expectedPage, actualPage);
        return new TeamsPlayerAndNewsScreen();
    }


}
