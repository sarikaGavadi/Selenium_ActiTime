package Assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToActitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.edgedriver().create();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    

		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.xpath("//div[text()='Login']")).click();

		Thread.sleep(1000);



	driver.findElement(By.xpath("//a[text()='Logout']")).click();

	System.out.println("logged out successfully");

	}



}
	
