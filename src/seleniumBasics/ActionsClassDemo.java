package seleniumBasics;

import java.util.function.LongUnaryOperator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo extends ChromeDemo{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String browser = "CHROME"; //"Chrome" // "CHROME"
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			 
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.geko.driver", "C:\\Users\\Manish\\Downloads\\chromedriver_win32\\geko.exe");
			driver = new FirefoxDriver();
		}
		
		
		openBrowser("https://www.amazon.in/");
		
		Actions actions =  new Actions(driver);
		//span[contains(text(),'Hello, Manish')]/../..
		
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]/../.."))).build().perform();
		Thread.sleep(2000);
		//actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Your Account')]/.."))).click().build().perform();
		
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Your Account')]/.."))).contextClick().build().perform();
		
		//actions.doubleClick(target);
		
		//actions.dragAndDrop(source, target);//html5 is not supporting
		
		Thread.sleep(2000);
		
		closeBrowser();
	
		
	}

}
