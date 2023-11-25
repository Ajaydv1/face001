package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Facebook {

	@Test
	
public void login()
{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ajayd\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://WWW.facebook.com");
		driver.findElement(By.name("email")).sendKeys("ajaydv@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ajay12345");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("ajay");
		driver.findElement(By.name("lastname")).sendKeys("dv");
		
}
}
