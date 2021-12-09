package com.expedia.test_runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},
        features = {"src/test/resources/features"},
        glue = {"com/expedia"},
        tags = "@demo"
)



public class Test_Runner  extends AbstractTestNGCucumberTests {
}
