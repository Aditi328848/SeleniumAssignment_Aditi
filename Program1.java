package Selenium_Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;


public class Program1 {

	public static void main(String[] args) {
		 LoginPage loginpage;
		    HomePage homepage;
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidyashree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    
		    
		    WebDriver driver= new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/");
		    driver.manage().window().maximize();
		    loginpage = new LoginPage(driver);
		    loginpage.setUserName("Admin");
		    loginpage.setPassword("admin123");
		    loginpage.clickOnLoginBtn();
		    
		    homepage = new HomePage(driver);
		    homepage.moveToAdminOrganizationGeneralInfo();

	}

}
