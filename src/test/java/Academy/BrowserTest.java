package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData() throws InterruptedException
	{
		System.out.println("Hello Everybody !");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://qadevopsdemosumit.azurewebsites.net/webapp/");
		driver.manage().window().maximize();
		
		/*****
		String text =driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
		driver.close();
	   *********/
		
		String text1 = driver.findElement(By.xpath("//*[text()=' One Large Ocean']")).getText();
		String text2 = driver.findElement(By.cssSelector("h2")).getText();
		
		System.out.println();
		
		System.out.println("The heading is : "+text1);
		System.out.println("The first line is : "+text2);
		
		System.out.println();
		
		if (text1.contains("Ocean")){			
			System.out.println("The heading is displayed as expected.");
		}else{
			System.out.println("Not properly displayed");
		}		
		
		if (text2.contains("voyage")){			
			System.out.println("The first line is displayed as expected.");
		}else{
			System.out.println("Not properly displayed");
		}
		
		Thread.sleep(2000);
		
		driver.close();	
		
		
		
		
	}
}
