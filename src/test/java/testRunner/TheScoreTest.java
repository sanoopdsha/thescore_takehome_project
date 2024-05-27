package test.java.testRunner;


import main.java.screenEvents.*;
import org.testng.annotations.Test;

public class TheScoreTest extends BaseTest {
    @Test
    public void verifyContentNavigationFlow() {
        LandingScreen landingScreen = new LandingScreen();
        landingScreen
                .clickOnGetStartedButton();
        LeagueSelectionScreen leagueSelectionScreen = new LeagueSelectionScreen();
        leagueSelectionScreen
                .clickOnNhlHockey()
                .verifyingNhlTextDisplayed()
                .clickOnContinueBtn1();
        TeamSelectionScreen teamSelectionScreen = new TeamSelectionScreen();
        teamSelectionScreen
                .clickOnMaybeLaterBtn1()
                .clickOnTorTeam()
                .clickOnContinueBtn2();
        NeverMissAGameScreen neverMissAGameScreen = new NeverMissAGameScreen();
        neverMissAGameScreen
                .clickOnDoneBtn();
        TheScoreMessagingScreen theScoreMessagingScreen = new TheScoreMessagingScreen();
        theScoreMessagingScreen
                .clickOnMayBeLaterBtn2();
        TeamsPlayerAndNewsScreen teamsPlayerAndNewsScreen = new TeamsPlayerAndNewsScreen();
        teamsPlayerAndNewsScreen
                .clickOnOkGotItBtn()
                .clickOnNhlIcon();
        NhlScreen nhlScreen = new NhlScreen();
        nhlScreen
                .verifyingNhlPageTitle()
                .clickingOnLeadersTab()
                .verifyingLeaderTabTitle()
                .verifyDataForLeagueDisplayedCorrectly()
                .verifyBackNavigationReturnsToPreviousPage();
    }
}
