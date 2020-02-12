package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//class SiteName{
//    String site = "amazon";
//    static String nameOfTheSite(){
//        return site;
//    }
//}
public class StepDefination {
    private WebDriver driver;
    @Given("user goes to the {string} page")
    public void user_goes_to_the_page(String string) {
        string = "amazon";String chromeDriverPath = "C:\\Users\\manis\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("http://"+string+".com");
    }

    @Given("user clicks on login button")
    public void user_clicks_on_login_button() {
        //driver.findElement(By.id("a-autoid-0-announce")).click();

    }
    @When("user enters the wrong  {string}")
    public void user_enters_the_wrong(String username) {
        username = "m123@amazon.com";
        driver.findElement(By.id("a-autoid-0-announce")).click();

        driver.findElement(By.id("ap_email")).sendKeys(username);
        driver.findElement(By.id("continue")).click();
    }

    @Then("user is prompted to enter the correct username")
    public void user_is_prompted_to_enter_the_correct_username() {
       String title = driver.getTitle();
        Assert.assertEquals("Amazon Sign-In",title);
    }

}
