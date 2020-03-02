package seleniumprac;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eht22\\Downloads\\java_selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Test");
		Thread.sleep(3000);
		List<WebElement>list= driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0;i<list.size();i++)
		{
			String str=driver.findElements(By.xpath("//ul[@role='listbox']//li")).get(i).getText();
			System.out.println(str);
			if(str.contains("testis"))
			{
				driver.findElements(By.xpath("//ul[@role='listbox']//li")).get(i).click();
				break;
			}
		}
		
		
		

	}

}
