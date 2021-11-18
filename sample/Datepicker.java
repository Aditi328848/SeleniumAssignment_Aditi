package sample;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
	    public static void main(String[] args) {
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\SDET\\chromedriver\\chromedriver.exe");
	        WebDriver driver1 = new ChromeDriver();
	        driver1.get("https://devlabs-860f0.web.app/calender");
		}
		private WebDriver driver;
	        //Find the date time picker control
 WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='birthday.ramko']"));

	        //Fill date as mm/dd/yyyy as 09/25/2013
          dateBox.sendkeys("09252013");

	        //Press tab to shift focus to time field

	       

	      

