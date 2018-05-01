package Selenium.mmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class mmtLoginTest {
  @Test
  public void f() throws InterruptedException {
	  
	  ChromeOptions option = new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  System.setProperty("webdriver.chrome.exe", "resources/chromedriver.exe");
	  WebDriver driver = new ChromeDriver(option);
	  
	  driver.get("https://www.makemytrip.com/");
	  driver.findElement(By.id("ch_login_icon")).click();
	  
	  String username = "zenabkale@gmail.com", password="DAnish@106";
	  Thread.sleep(2000);
	  driver.findElement(By.id("ch_login_email")).sendKeys(username);
	  driver.findElement(By.id("ch_login_password")).sendKeys(password);
	  driver.findElement(By.id("ch_login_btn")).click();
	  driver.quit();
  }
}
