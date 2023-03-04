package Cucumberproj;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources",glue= {"Stepddefination"},
plugin= {"pretty","json:JSONREPORT/report.json","html:HtmlRepoert/report","junit:JunitReport/report.xml"},
tags= "@Smoke or @Sanity or @Regression")

public class Runnerclshooksntags {
	
	
	

}
