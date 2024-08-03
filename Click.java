package com.mouseevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click {
    
	protected static String url="https://the-internet.herokuapp.com";
	WebDriver driver;
 
  @BeforeSuite
  public void startchromebrowser() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  @Test
  public void mouseclick() throws InterruptedException {
	  driver.get(url);           
	  WebElement AddRemoveelement=driver.findElement(By.linkText("Add/Remove Elements"));
	  AddRemoveelement.click();
	  Thread.sleep(3000);
  }
  
  @AfterSuite
  public void closechromebrowser() {
	  driver.quit();
  }
  
}

