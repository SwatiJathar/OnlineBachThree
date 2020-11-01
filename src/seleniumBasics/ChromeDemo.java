package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDemo {
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			 
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.geko.driver", "C:\\Users\\Manish\\Downloads\\chromedriver_win32\\geko.exe");
			driver = new FirefoxDriver();
		}
		
		openBrowser();
		getTitle();
		getCurrentUrl();
		getPageSource();
		closeBrowser();
		
	}
	
	public static void openBrowser() throws InterruptedException{
		
		//driver.navigate().to("https://www.amazon.in/");
		//Thread.sleep(5000);
		driver.navigate().to("https://retail.onlinesbi.com/retail/login.htm#");
		
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
	
	public static void closeBrowser() throws InterruptedException{
		//driver.close();
		driver.quit();
	}

}
