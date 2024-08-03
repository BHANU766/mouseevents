package com.mouseevents;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clickandhold {
     
	protected static String url="https://www.tutorialspoint.com/selenium/practice/menu.php#";
	WebDriver driver;
 
  @BeforeSuite
  public void startchromebrowser() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  @Test
  public void mouseclickandhold() throws InterruptedException {
	  driver.get(url);
	  WebElement navbar=driver.findElement(By.linkText("Navbar"));
	  
	  String beforecolor=navbar.getCssValue("color");
	  System.out.println("rgba code format "+ beforecolor);
	  Thread.sleep(2000);
	  
	  //create an object Actions class
	  Actions actions=new Actions(driver);
	  actions.clickAndHold( navbar).build().perform();
	  Thread.sleep(3000);
	  
	  String aftercolor=navbar.getCssValue("color");
	  System.out.println("rgba code format "+ aftercolor);
	  Thread.sleep(2000);
  }
 
  
  @AfterSuite
  public void closechromebrowser() {
	  driver.quit();
  }
  
}
