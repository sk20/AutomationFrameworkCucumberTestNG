package com.aavil.projects.website.cms.pages;

import static com.aavil.keywords.WebUI.*;

import org.openqa.selenium.By;

public class CommonPageCMS {

    private By menuProducts = By.xpath("//span[normalize-space()='Products']");

    public void verifyDashboardPageDisplays() {
        waitForPageLoaded();
        verifyContains(getCurrentUrl(), "/admin", "The URL not match.");
        verifyElementPresent(menuProducts, 5, "Login failed. The Dashboard page not displays.");
    }

}
