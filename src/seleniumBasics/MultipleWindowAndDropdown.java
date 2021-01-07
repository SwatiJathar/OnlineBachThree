package seleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleWindowAndDropdown extends ChromeDemo{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
				String browser = "CHROME"; //"Chrome" // "CHROME"
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "W:\\chromedriver.exe");
			driver = new ChromeDriver();
			 
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.geko.driver", "W:\\geko.exe");
			driver = new FirefoxDriver();
		}
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\OnlineBachThree\\src\\seleniumBasics\\OR.properties");
			
			or = new Properties();
			
			or.load(fis);
			
			System.out.println(or.getProperty("lnkForgotPass"));
			
			Thread.sleep(5000);
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		openBrowser("https://retail.onlinesbi.com/retail/login.htm");
		personalBanking();
		
		click(driver.findElement(By.xpath( or.getProperty("lnkForgotPass") )));
		
		String parentWindowId = driver.getWindowHandle();
		
		Set<String> windiwIds = driver.getWindowHandles();
		
		
		for (String windowId : windiwIds) {
			
			
			if(false == parentWindowId.equalsIgnoreCase(windowId)){
				
				driver.switchTo().window(windowId);
				
				//driver.findElement(By.xpath("//select[@name='issueCode']"));
				Select forgotPassOptions =  new Select(driver.findElement(By.xpath( or.getProperty("drpIssueValue") )));
				//forgotPassOptions.selectByIndex(2);
				//forgotPassOptions.selectByValue("ResetLoginPassword");
				forgotPassOptions.selectByVisibleText("Forgot Username");
				Thread.sleep(2000);
				
				click(driver.findElement(By.xpath( or.getProperty("btnNextStep") )));
				
				System.out.println(parentWindowId + " =====================" + driver.getWindowHandle());
				
				driver.close();
				
				break;
				
			}
		}
		
		driver.switchTo().window(parentWindowId);
		
		
		click(driver.findElement(By.xpath("//a[contains(text(),'New User ? Register here/Activate ')]")));
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		alert.accept();
		//alert.sendKeys("");
		
		Thread.sleep(2000);
		closeBrowser();
		

	}

}
