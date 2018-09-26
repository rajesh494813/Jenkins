package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;


public class LoginPage {
public static WebDriver driver;
	
public void init() {
		
		System.setProperty("webdriver.chrome.driver", "D://workspace_Rajesh//chromedriver.exe");

		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new  ChromeDriver(options);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
	
		
		
		
		
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Find flights from and to international destinations around the world']")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Find flights from and to international destinations around the world']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Find hotels in destinations around the world']")));
		
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
			       .withTimeout(30,TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//a[@title='Find hotels in destinations around the world']"));
			     }
			   });
		
		
	}
	
	
    public void ClickFlights() {
    	driver.quit();
     
    	
    }
	
	
	
	
}
