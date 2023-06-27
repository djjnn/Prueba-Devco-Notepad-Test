package net.onlinenotepad.runners;

import io.cucumber.java.BeforeAll;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "net.onlinenotepad.stepdefinitions",
        features = "src/test/resources/features/notepadTest.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class notepad_runner {
}
