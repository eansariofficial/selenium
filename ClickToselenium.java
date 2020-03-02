package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickToselenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eht22\\Downloads\\java_selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement web = driver.findElement(By.xpath("//li[text()='A']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(web);
		actions.clickAndHold().perform();

	}

}
