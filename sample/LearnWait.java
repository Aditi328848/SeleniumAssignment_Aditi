package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SDET\\chromedriver\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
       
		driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver1.manage().window().maximize();
        
        //implicit wait
        driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        WebElement we =driver1.findElement(By.id("txtUsername"));
        we.sendKeys("Admin");
        
        WebElement we1 =driver1.findElement(By.id("txtPassword"));
        we1.sendKeys("admin123");
        
        driver1.findElement(By.id("btnLogin")).click();

	}

}
