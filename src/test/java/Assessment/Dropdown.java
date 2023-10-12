package Assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		{

		WebDriver driver = WebDriverManager.edgedriver().create();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		

		driver.get("https://www.amazon.in/");

		

		Thread.sleep(1000);

		

		WebElement element = driver.findElement(By.id("searchDropdownBox"));

		

		Select s=new Select(element);

		s.selectByVisibleText("Beauty");

		 driver.close();

	 

	}

	}
}
