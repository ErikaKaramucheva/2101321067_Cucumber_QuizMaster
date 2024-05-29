package uni.pu.fmi;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin ={"pretty", "html:target/report.html"} )
public class TestsViewStarter {

}
