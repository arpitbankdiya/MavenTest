package example;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void f() {
	  Assert.assertTrue(true);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://demo.guru99.com/v4");
  }

}
