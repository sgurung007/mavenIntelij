package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

@CucumberOptions(
        features = "src/features/Login.feature",
        glue = "stepDefinitions",
        monochrome = true,
        dryRun = false,
        strict = true,
        plugin = {"pretty", "html:target/resultHtml", "json:target/jsonReport/resultJson.json"}

)
public class MyRunner extends AbstractTestNGCucumberTests {
    public static WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test print");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("aftersuit print");
    }

    public static void closeBrower(){
        driver.quit();
    }
}
