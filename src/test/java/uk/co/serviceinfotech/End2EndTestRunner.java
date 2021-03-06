package uk.co.serviceinfotech;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "uk.co.serviceinfotech.glue",
        plugin = {"pretty", "json:report/cucumber.json"},
        strict = true,
        features = "src/test/resources/features/",
        snippets = SnippetType.CAMELCASE,
        stepNotifications = true,
        tags = "@cofeeshop")

public class End2EndTestRunner {
}
