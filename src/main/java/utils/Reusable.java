package main.java.utils;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static test.java.testRunner.BaseTest.getWait;

public class Reusable {


    public static WebElement getMobileElement(String identifierType, String identifierValue) {
        switch (identifierType) {
            case "accessibilityId":
                return getWait().until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId(identifierValue)));
            case "xpath":
                return getWait().until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath(identifierValue)));
            default:
                return null;
        }
    }


}

