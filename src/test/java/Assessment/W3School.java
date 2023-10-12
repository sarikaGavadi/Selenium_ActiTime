package Assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3School {

	public static void main(String[] args) {
		WebDriver driver=WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
      //  driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_date\"]")).click();

		driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\Sarika.Gevadi\\Desktop\\Book.xlsx");

		driver.close();

		

	}

}

