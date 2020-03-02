package seleniumprac;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Gen
{
	public void click(WebDriver driver, WebElement web)
	
	{
		
		highlight(driver, web);
		web.click();
	}
	
	public void highlight(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js1 =(JavascriptExecutor) driver;
		js1.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	 
	}
}

public class IciciIframe extends Gen {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		Gen gen = new Gen();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eht22\\Downloads\\java_selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/");
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
//		System.out.println(alert.getText());
		WebElement web1=driver.findElement(By.xpath("//div[@class='push-popup desktop-only']//div[@id='push-modal-content']//div[text()='Later']"));
		gen.click(driver, web1);
		
		gen.click(driver,driver.findElement(By.xpath("//a[text()='Products']")) );
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println(driver.findElement(By.xpath("(//li[@class='thumbpoints']//div[text()='Personal Loan'])[1]")).getText());
		WebElement web = driver.findElement(By.xpath("(//li[@class='thumbpoints']//div[text()='Personal Loan'])[1]"));
		//scroll(web, driver);
		js.executeScript("arguments[0].click();", web);
		//highlight(driver, web);
		//screenshot(driver, "E:\\abc.png");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='EMI Calculator '])[1]")).click();
		
		Thread.sleep(3000);
		//Actions act=new Actions(driver);
		//WebElement ele12=driver.findElement(By.xpath("//a[text()='check your eligibility']"));
		//act.moveToElement(ele12).build().perform();
		driver.switchTo().frame(1);
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[@class='close']")).click();
		//act.moveToElement(driver.findElement(By.xpath("//span[@class='close']"))).build().perform();
		driver.findElement(By.xpath("(//input[@id='loanAmount'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='loanAmount'])[1]")).sendKeys("100000");;
		
		
		
	}
	static void scroll(WebElement web, WebDriver driver) throws InterruptedException {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", web);
		Thread.sleep(500);
	}
	
	static void screenshot(WebDriver webdriver,String fileWithPath) throws IOException
	{
		//Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);
               
              
	}
	
        

	

}
