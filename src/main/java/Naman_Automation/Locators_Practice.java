 package Naman_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Practice {
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:/Users/Naman Goel/Documents/Drivers/chromedriver.exe");
   	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://keygen.yoctel.com/");
	driver.findElement(By.id("exampleInputUsername")).sendKeys("amitabh@yoctel.com");
	driver.findElement(By.id("exampleInputPassword")).sendKeys("Yoc@abc1"); 
	driver.findElement(By.id("myloginbtn")).click();
	System.out.println("Error Message is : "+driver.findElement(By.cssSelector("span.text-danger")).getText());
	driver.findElement(By.linkText("Forget Password")).click();
    Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='txtusername']")).sendKeys("Naman");
	driver.findElement(By.xpath("//*[@id='txtusername']")).clear();
	driver.findElement(By.xpath("//*[@id='txtusername']")).sendKeys("Naman2");

	 
//driver.close();


}
}
