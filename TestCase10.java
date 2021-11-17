package Selenium_Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase10 {

	public static void main(String[] args) 
	{
		 // System.setProperty("webdriver.chrome.driver", "C:\\soft\\Selenium Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidyashree\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        
	        
	        driver.get("https://opensource-demo.orangehrmlive.com/");
			
			driver.findElement(By.xpath("//input[@id='txtUsername']"));
	        WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
	       
		     driver.findElement(By.xpath("//input[@id='txtPassword']"));
	        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));

	             username.sendKeys("Admin");
	             password.sendKeys("admin123");
	             By loginBtn = By.id("btnLogin");
				// login.click();
	             driver.findElement(loginBtn).click();
	       String actualUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		   
	       String expectedUrl= driver.getCurrentUrl();
		   
	       Assert.assertEquals(expectedUrl,actualUrl);
		   
		   System.out.println("Login is Successful");
		   
		   driver.findElement(By.linkText("Dashboard")).click();
				String DashHead = driver.findElement(By.xpath("//div[@class='head']//child::h1")).getText();
				System.out.println(DashHead);
				
		   driver.close();

	}

}
