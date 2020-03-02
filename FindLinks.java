package seleniumprac;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eht22\\Downloads\\java_selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		String title =driver.getTitle();
		System.out.println(title);
		
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		Iterator<WebElement> ite = list.iterator();
		while(ite.hasNext()) {
		String url = ite.next().getText();
		System.out.println(url);
		}
		
		driver.close();
		

	}

}
