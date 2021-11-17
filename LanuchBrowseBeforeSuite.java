package Selenium_Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LanuchBrowseBeforeSuite {
	@Test
    public void beforeSuiteTesting()
	{
	System.out.println("before Suite execution");
	}
	@BeforeSuite
	public void before_suite() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidyashree\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	driver.close();
	}

	

}
