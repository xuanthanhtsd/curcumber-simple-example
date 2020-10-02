package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.Guru99HomePage;
import pageObjects.Guru99Login;


public class steps {
  WebDriver driver;
  Guru99Login objLogin;
  Guru99HomePage objHomePage;

  @Given("^User launch chrome browser$")
  public void user_launch_chrome_browser() {
    System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //driver.get("http://demo.guru99.com/V4/"); 
    
  }

  @When("User open the URL: {string}")
  public void user_open_the_url(String url) {
    driver.get(url);
      
  }

  @When("User enters user name as {string} and password as {string}")
  public void user_enters_user_name_as_and_password_as(String userName, String password) {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    //objLogin.setUserName(userName);
    //objLogin.setPassword(password);
    System.out.println("User name: " + userName + password);
  }

  @When("Click on login")
  public void click_on_login() {
    //objLogin.clickLogin();
    System.out.println("Click login");
  }

  @Then("Page title shoud be {string}")
  public void page_title_shoud_be(String title) {
    //Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains(title));
    System.out.println("Title is " + title);
  }

  @Then("Close the browser")
  public void close_the_browser() {
      driver.quit();
  }
  
  
}
