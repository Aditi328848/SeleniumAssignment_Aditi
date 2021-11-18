package sample;


import org.openqa.selenium.By;
//login for opensource-demo.orangehrmlive.com
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SDET\\chromedriver\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
       
		driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver1.manage().window().maximize();
        
        WebElement we =driver1.findElement(By.id("txtUsername"));
        we.sendKeys("Admin");
        
        WebElement we1 =driver1.findElement(By.id("txtPassword"));
        we1.sendKeys("admin123");
        
        driver1.findElement(By.id("btnLogin")).click();
        driver1.findElement(By.id("welcome")).click();
       
	
		
		
        
        
        

	}

}
