package Assignment;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scenerio13 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
      @Test
	public  static void a() throws InterruptedException

	{

		WebDriver driver = new ChromeDriver();// casting
		driver.manage().window().maximize();// maximize the browser window
		Actions a = new Actions(driver);
		driver.navigate().to("https://www.bluestone.com/");
		WebElement ele = driver.findElement(By.xpath("//li[@class=\"menuparent offers-menuparent pull-right\"]"));
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
	     driver.findElements(By.xpath("//span[@data-p=\"offers-flat20off,m\"]"));
	     Thread.sleep(2000);

		driver.quit();
	}
		


}

