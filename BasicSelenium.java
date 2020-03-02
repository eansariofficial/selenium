package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eht22\\Downloads\\java_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		String expected = "Facebook – log in or sign up";
		System.out.println(title);
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ehtssham");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1233");
		String crt=driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']")).getText();
		System.out.println(crt);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ehtesham");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ansari");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("eht222@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("eht222@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345678");
		WebElement dat = driver.findElement(By.xpath("//select[@id='day']"));
		Select select = new Select(dat);
		select.selectByValue("11");
		WebElement mont= driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s2 = new Select(mont);
		s2.selectByValue("3");
		
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s3 = new Select(year);
		s3.selectByValue("2012");
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		String expextedNot ="Sorry, we are not able to process your registration.";
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'referer_frame.php')]")));
		String actualNot = driver.findElement(By.xpath("//form[@name='reg']")).getText().trim();
		System.out.println("aaaa");
		if (actualNot.contains(expextedNot)) 
			System.out.println("PAss");
		
		
			// TODO: handle exception
		else
			System.out.println("fail");
		
		
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
//		if (title.contains(expected)) {
//			System.out.println("passed");
//			
//		}
//		else
//			System.out.println("fail");
//		System.out.println(driver.getPageSource());
		
		//to close the current instance
		
		//driver.close();
		//to close all the instance
		//driver.quit();
		
		//WebElement ele=  driver.findElement(By.xpath("//select[@id='day']"));
		// select class is used to handle drop down
		//Select select=new Select(ele);
		//select.selectByValue("5");

	}

}
