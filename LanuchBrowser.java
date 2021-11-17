package Selenium_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanuchBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidyashree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://opensource-demo.orangehrmlive.com/";
	driver.get(url);
	
		
		
	/*driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		driver.close();
	

	}

}
