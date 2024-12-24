package com.aavil.projects.website.crm.stepdefinitions;

import com.aavil.common.CommonPageCRM;
import com.aavil.driver.ScenarioManager;
import com.aavil.helpers.CaptureHelpers;
import com.aavil.keywords.WebUI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.aavil.keywords.WebUI.*;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DashboardSteps extends CommonPageCRM {

    @Given("User logged in with email {string} and password {string}")
    public void userLoggedInWithEmailAndPassword(String email, String password) {
        WebUI.openWebsite("https://hrm.anhtester.com/");
        WebUI.setText(By.xpath("//input[@id='iusername']"), email);
        CaptureHelpers.takeScreenshotScenario(ScenarioManager.getScenario(), "Screenshot Email");
        WebUI.setText(By.xpath("//input[@id='ipassword']"), password);
        WebUI.clickElement(By.xpath("//button[@type='submit']"));
    }

    @Given("User navigate to dashboard")
    public void userNavigateToDashboard() {
        waitForPageLoaded();
        verifyElementVisible(By.xpath("//span[normalize-space()='Home']"), 20);
        //Assert.assertTrue(checkElementExists(By.xpath("//span[normalize-space()='Home']")),"The Home page not display.");

    }

    @When("User click {string}")
    public void userClick(String menu) {
        WebUI.waitForPageLoaded();
        WebUI.sleep(2);
        WebUI.clickElement(By.xpath("//span[contains(text(),'" + menu + "')]"));
    }

    @Then("The user redirect to this page {string}")
    public void the_user_redirect_to_this_page(String menu) {
        WebUI.waitForPageLoaded();
        WebUI.verifyElementTextContains(By.xpath("//div[@id='smartwizard-2']//ul//li[contains(@class, 'nav-item active')]/a"), menu);
    }

}
