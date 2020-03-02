package seleniumprac;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
class Input{
	 public String enter() {
		 Scanner scanner= new Scanner(System.in);
		 System.out.println("Enter value");
		 return  scanner.nextLine();
	}
	
	
}
public class SeleniumEasy {

	public static void main(String[] args) throws InterruptedException {
		Input input= new Input();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eht22\\Downloads\\java_selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Simple Form Demo']")).click();
//Alert alert=driver.switchTo().alert();
//alert.accept();
//alert.dismiss();
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys(input.enter());
		driver.findElement(By.xpath("//button[text()='Show Message']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("22");
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("23");
		driver.findElement(By.xpath("//button[text()='Get Total']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Check Box Demo']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
		driver.findElement(By.xpath("//label[text()='Option 1']")).click();
		driver.findElement(By.xpath("//label[text()='Option 2']")).click();
		driver.findElement(By.xpath("//label[text()='Option 3']")).click();
		driver.findElement(By.xpath("//label[text()='Option 4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='check1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='check1']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Radio Buttons Demo']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='optradio']")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		String arr="Ehte,bijoy,Husssan";
//		String ar1[]=arr.split(",");
		
		
//		for(String val:ar1)
//			System.out.println(val);
//		System.out.println(driver.getWindowHandle());
//		Set<String>set=driver.getWindowHandles();
//		Iterator<String>itr=set.iterator();
//		while(itr.hasNext())
//		{
//		String childWind=itr.next();
//		driver.switchTo().window(childWind);		}
//		
//		driver.navigate().back();
		
		}

}
