package Naman_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Handling {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Naman Goel/Documents/Drivers/chromedriver.exe");
	   	WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//dropdown with select element or tag available in HTML
/*
 * WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

Select dropdown = new Select(staticDropdown);
dropdown.selectByIndex(2);
System.out.println(dropdown.getFirstSelectedOption().getText());
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000L);
	int i =1;
	while(i<4){
	driver.findElement(By.id("hrefIncAdt")).click();
	i++;
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println("Selected Passengers is : " + driver.findElement(By.id("divpaxinfo")).getText());
*/
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.xpath("(//a[@value='BLR'])[1]")).click();
System.out.println(driver.findElement(By.xpath("(//a[@value='BLR'])")).getText());
driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
System.out.println(driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).getText());

	
	}


}
