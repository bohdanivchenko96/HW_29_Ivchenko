import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@Smoke, @AgileProject"},
        features = "src/test/resources",
        glue = {"steps"},
        plugin = { "pretty", "html:target/htmlreptorts"}
)
public class TestRunner {

}
