package com.aavil.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features/LoginCMS.feature",
        glue = {
                "com.aavil.projects.website.cms.stepdefinitions",
                "com.aavil.hooks"
        },
        plugin = {
                "com.aavil.hooks.CucumberListener",
                "pretty",
                "html:target/cucumber-reports/TestRunnerLoginCMS.html",
                "json:target/cucumber-reports/TestRunnerLoginCMS.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,
        tags = "@regression"
)

public class TestRunnerLoginCMS extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}