package seleniumBasics;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDemo {
	static WebDriver driver = null;
	
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
		
		openBrowser();
		//getTitle();
		//getCurrentUrl();
		//getPageSource();
		personalBanking();
		login();
		closeBrowser();
		
	}
	
	public static void openBrowser() throws InterruptedException{
		
		//driver.navigate().to("https://www.amazon.in/");
		//Thread.sleep(5000);
		driver.navigate().to("https://retail.onlinesbi.com/retail/login.htm#");
		//driver.get("https://retail.onlinesbi.com/retail/login.htm#");
		//driver.navigate().back();
		Thread.sleep(5000);
		//driver.navigate().forward();
	}
	
	public static void getTitle(){
		System.out.println("Title === " + driver.getTitle());
	}
	
	public static void getCurrentUrl() {
		System.out.println("URL === " + driver.getCurrentUrl());
	}
	
	public static void getPageSource(){
		System.out.println("Page Source  === " + driver.getPageSource());
	}
	
	public static void personalBanking() throws InterruptedException{
		driver.findElement(By.partialLinkText("CONTINUE TO ") ).click();
		Thread.sleep(2000);
	}
	
	public static void login() throws InterruptedException{
		driver.findElement(By.id("username") ).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username") ).sendKeys("username");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password") ).click();
		Thread.sleep(1000);
		
		String pass = "SW5kaWEgVGVhbSB3aWxsIHdpbiB0aGUgQ3Vw";
		//Base64.getDecoder().decode(pass).toString() 
		driver.findElement(By.name("password") ).sendKeys(Base64.getDecoder().decode(pass).toString());
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='loginCaptchaValue']") ).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='loginCaptchaValue']") ).sendKeys("captcha");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@id='capOption'])[2]") ).click();
		Thread.sleep(1000);
		driver.findElement(By.id("chkbox") ).click();
		Thread.sleep(1000);
	}
	
	
	public static void closeBrowser() throws InterruptedException{
		//driver.close();
		driver.quit();
	}

}
