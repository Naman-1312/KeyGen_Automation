package Naman_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators_Practice_2 {
	public static void main (String[]args) throws InterruptedException {
	
	String Title = "Org Wise Sales Report"; // Dashboard Page Title
	System.setProperty("webdriver.chrome.driver","C:/Users/Naman Goel/Documents/Drivers/chromedriver.exe");
   	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://keygen.yoctel.com/");
	driver.findElement(By.id("exampleInputUsername")).sendKeys("amitabh@yoctel.com");
	driver.findElement(By.id("exampleInputPassword")).sendKeys("Yoc@abc1/"); 
	driver.findElement(By.id("myloginbtn")).click();
	driver.findElement(By.xpath("//*[@id=\"orgwisereport\"]/div[1]/h4")).getText();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//*[@id=\"orgwisereport\"]/div[1]/h4")).getText());
//	Thread.sleep(2000);
	Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"orgwisereport\"]/div[1]/h4")).getText(),Title);
	driver.findElement(By.className("img-circle")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/nav/ul[2]/li/ul/li[11]")).click();
	driver.close();
	
}
}
