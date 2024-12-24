package com.aavil.driver;

import com.aavil.utils.LogUtils;

import io.cucumber.java.Scenario;

public class ScenarioManager {

    private static Scenario scenario;

    public static Scenario getScenario() {
        LogUtils.info("Scenario in ScenarioManager: " + scenario);
        return scenario;
    }

    public static void setScenario(Scenario scenario) {
        ScenarioManager.scenario = scenario;
    }
}
