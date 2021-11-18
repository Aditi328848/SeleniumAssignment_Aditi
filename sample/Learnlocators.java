package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnlocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	        System.setProperty("webdriver.chrome.driver", "C:\\SDET\\chromedriver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	    driver.get("https://google.com");
	    driver.manage().window().maximize();

	 

	    }

	}


