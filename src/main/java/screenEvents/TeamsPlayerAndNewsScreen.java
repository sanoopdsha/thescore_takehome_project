package main.java.screenEvents;

import io.appium.java_client.AppiumBy;
import main.java.screenObjects.TeamsPlayerAndNewsElements;
import main.java.utils.Reusable;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static test.java.testRunner.BaseTest.getWait;

public class TeamsPlayerAndNewsScreen {

    public TeamsPlayerAndNewsScreen clickOnOkGotItBtn() {
        try {
            WebElement okGotItBtn = getWait(Duration.ofSeconds(1))
                    .until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath(TeamsPlayerAndNewsElements.okGotItBtn)));
            if (okGotItBtn.isDisplayed()) {
                okGotItBtn.click();}
        } catch (TimeoutException e) {
            System.out.println("Element not visible within the timeout period: " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        return this;
    }

    public NhlScreen clickOnNhlIcon() {
        Reusable.getMobileElement("xpath", TeamsPlayerAndNewsElements.nhlIcon).click();
        return new NhlScreen();
    }


}
