package com.mycompany.app.Maven_Selenium_July;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FristTest {
	public WebDriver driver;
  @Test
  public void f() 
  {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
}
