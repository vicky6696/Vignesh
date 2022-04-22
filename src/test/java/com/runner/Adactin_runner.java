package com.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@Test
@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\WELCOME\\eclipse-workspace\\test\\Maven_Cucumber\\src\\test\\java\\com\\FeatureFile\\Adactin.feature" , glue = "com.StepDefinition")
/*
 * (features =
 * "C:\\Users\\WELCOME\\eclipse-workspace\\test\\Maven_Cucumber\\src\\test\\java\\com\\FeatureFile\\Adactin.feature"
 * ,glue = "StepDefinition")
 */
public class Adactin_runner {

}
