package com.sandikurnia.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/technicalTestBibitSandiKurnia.json",
                "html:target/cucumber-reports/technicalTestBibitSandiKurnia.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/Feature/buyProduct.feature",
        glue ={"stepDef"},
        monochrome = true,
        dryRun = false,
        tags = "@BuyProductFeature"
)

public class testRunner extends AbstractTestNGCucumberTests {
}
