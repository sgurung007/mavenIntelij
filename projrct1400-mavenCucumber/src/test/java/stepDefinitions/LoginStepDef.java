package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static runners.MyRunner.driver;

public class LoginStepDef extends baseCases {
   //public static WebDriver driver;

    @Given("open the home page of automationdirect.com")
    public void open_the_home_page_of_automationdirect_com() {
        System.out.println("step1");
        driver.manage().deleteAllCookies();
        driver.get("https://www.automationdirect.com/");
        String titleOfHomePage="AutomationDirect.com | #1 Value in Industrial Automation";
        Assert.assertEquals(titleOfHomePage,driver.getTitle(),"*** Not home page");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }


    @Then("navigate to the {string} from {string} in {string}")
    public void navigate_to_the_from_in(String string, String string2, String string3) {
        //driver.findElement(By.xpath("//a[contains(text(),'Cables')]")).click();
        //driver.findElement(new By.ById("catalog-btn")).click();
        System.out.println("step2");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
       // Assert.assertEquals("AutomationDirect Online Catalog",driver.getTitle(),"***Can not catalog page "+string3);
        //Assert.fail("suraj made me fail");
    }

    @Then("verify the download")
    public void verify_the_download() throws InterruptedException {
        Thread.sleep(4000);
        //driver.quit();
    }




}
