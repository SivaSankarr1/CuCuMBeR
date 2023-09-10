package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\LoginPage.feature",glue="org.stepdef"
,monochrome= false
,dryRun=false
,snippets=SnippetType.CAMELCASE
,plugin= {"pretty","json:C:\\Users\\$AM$ANKAR\\eclipse-workspace\\2022\\MavenOnlineClass\\target\\cucu\\report.json"}
)

public class TestRunnerClass {

}
