package seleniumBasics;

import java.util.Base64;

import javax.annotation.processing.SupportedOptions;

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
	
	public static void openBrowser(String url) throws InterruptedException{
		//"https://retail.onlinesbi.com/retail/login.htm#"
		//driver.navigate().to("https://www.amazon.in/");
		//Thread.sleep(5000);
		driver.navigate().to(url);
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
		
			click(driver.findElement(By.id("username") ));
			Thread.sleep(1000);
			sendKeys(driver.findElement(By.id("username") ), "username");
			Thread.sleep(1000);
		
			click(driver.findElement(By.name("password") ));
			Thread.sleep(1000);
			String pass = "SW5kaWEgVGVhbSB3aWxsIHdpbiB0aGUgQ3Vw";
			
			//Base64.getDecoder().decode(pass).toString() 
			sendKeys(driver.findElement(By.name("password") ), Base64.getDecoder().decode(pass).toString());
			Thread.sleep(1000);
		
		
		if( true == checkElement( driver.findElement(By.xpath("//input[@id='loginCaptchaValue']") )  ) ) {
		
			driver.findElement(By.xpath("//input[@id='loginCaptchaValue']") ).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='loginCaptchaValue']") ).sendKeys("captcha");
			Thread.sleep(1000);
		}
		WebElement audiocaptchaOption 	= driver.findElement(By.xpath("(//input[@id='capOption'])[2]") );
		WebElement imgcaptchaOption 	= driver.findElement(By.xpath("(//input[@id='capOption'])[1]") );
		
		if(true == checkEleIsSelected(imgcaptchaOption) ){
			System.out.println("Image captcha is defauled selected");
		}else{
			System.out.println("Image captcha is not defauled selected");
		}
		
		if(false == checkEleIsSelected(audiocaptchaOption)){
			System.out.println("Audio captcha is not selected");
		}else{
			System.out.println("Image captcha is not defauled selected");
		}
		
		
		if(true == checkEleIsSelected(imgcaptchaOption) && false == checkEleIsSelected(audiocaptchaOption) && true == checkElement(audiocaptchaOption) ){
		
			audiocaptchaOption.click();
		}
		
		Thread.sleep(1000);
		if(false == driver.findElement(By.id("chkbox") ).isSelected()){
			driver.findElement(By.id("chkbox") ).click();
			Thread.sleep(1000);
			
			if(true == driver.findElement(By.xpath("//td[contains(text(),'Online Virtual Keyboard')]")).isDisplayed()){
				System.out.println("Virtual keyboard is visible");
			}
		}
	}
	
	
	public static boolean checkElement(WebElement ele){
		
		if( true == checkVisiblityOfEle(ele) &&  true == checkEleIsEnable(ele) ){
			return true;
		}
		return false;
		
	}
	
	public static boolean checkVisiblityOfEle(WebElement ele ){
		return ele.isDisplayed();
	}
	
	public static boolean checkEleIsSelected(WebElement ele ){
		return ele.isSelected();
	}
	
	public static boolean checkEleIsEnable(WebElement ele ){
		return ele.isEnabled();
	}
	
	public static void sendKeys(WebElement ele, String value){
		if(true == checkElement(ele)){
			ele.sendKeys(value);
		}
	}
	
	public static void click(WebElement ele){
		if(true == checkElement(ele)){
			ele.click();
		}
	}
	
	public static void closeBrowser() throws InterruptedException{
		//driver.close();
		driver.quit();
	}

}
