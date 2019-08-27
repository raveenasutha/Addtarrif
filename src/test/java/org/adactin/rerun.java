package org.adactin;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src/test/resources/failed.txt",monochrome=true,
glue="hexa.stepdefinition")
public class rerun {

}
