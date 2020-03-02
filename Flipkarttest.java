package seleniumprac;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Flipkarttest {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\eht22\\Downloads\\java_selenium\\chromedriver.exe");
		Properties pro=new Properties();
		FileInputStream fFile=new FileInputStream("E:\\javaselenium\\seleniumprac\\src\\seleniumprac\\user.properties");
		pro.load(fFile);
		
		System.out.println(pro.get("url"));
		
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		String url= (String) pro.get("url");
		System.out.println(url);
		drive.get(url);
		System.out.println(drive.getTitle());
		String username = (String) pro.get("username");
		String userXpath= (String) pro.get("userXpath");
		drive.findElement(By.xpath(userXpath)).sendKeys(username);
		String password = (String) pro.get("password");
		String passXpath = (String) pro.get("passXpath");
		drive.findElement(By.xpath(passXpath)).sendKeys(password);
		String clk1 = (String) pro.get("clk1");
		drive.findElement(By.xpath(clk1)).click();
		Thread.sleep(3000);
		Actions actions = new Actions(drive);
		String hover1  = (String) pro.get("hover1");
		WebElement webElement= drive.findElement(By.xpath(hover1));
		actions.moveToElement(webElement).build().perform();
		
		Thread.sleep(2000);
		String clk2 = (String) pro.get("clk2");
		drive.findElement(By.xpath(clk2)).click();
		//drive.findElement(By.xpath("//div[@class='_3BTv9X']")).click();
		//drive.findElement(By.xpath("//div[@data-id='BLBFGGRHGPKCAEUZ']//div[@class='_3liAhj']")).click();
		
		
		
		Thread.sleep(3000);
		drive.close();

	}

}
