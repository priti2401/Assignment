package Assignment;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Scenerio5 {
	

	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
      @Test
	public  static void m5() throws InterruptedException

	{

		WebDriver driver = new ChromeDriver();// casting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);// maximize the browser window
		driver.navigate().to("https://www.bluestone.com/");
        Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[@title='Rings']"));
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='odd-even-bg']/descendant::ul[@class='two-col']/li/a[@title='Diamond Rings']")).click();
        List<WebElement> ele1=driver.findElements(By.xpath("//span[@class='p-wrap']"));
        Reporter.log("Before Sort");
        for (WebElement beforesort :ele1) {
        	System.err.println(beforesort.getText());
        }
        driver.findElement(By.xpath("//section[@class='block sort-by pull-right']/span")).click();

		driver.findElement(By.xpath("//div[@class='from-items select-view-by']/descendent::a[contains(.,'Price Low to High')]")).click();
		Thread.sleep(2000);
		List<WebElement> ele2=driver.findElements(By.xpath("//span[@class='p-wrap']"));
		System.err.println("After Sort");
		
		for (WebElement aftersort : ele2)
		{
		System.out.println(aftersort.getText());	
		}
		driver.quit();
	}
		
}

