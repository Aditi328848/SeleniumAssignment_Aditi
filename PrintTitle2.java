package Selenium_Assignments;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.chrome.ChromeDriver;
public class PrintTitle2 {

	public static void main(String[] args) {
		  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidyashree\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        
	        
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        
	        String title = driver.getTitle();
	        
	    
	        System.out.println(title);
	       

	 

	        driver.close();

	}

}
