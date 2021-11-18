package sample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {
	private static JavascriptExecutor js;

	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "C:\\SDET\\chromedriver\\chromedriver.exe");
    WebDriver driver1 = new ChromeDriver();
    driver1.get("https://google.com");
    JavascriptExecutor js=(JavascriptExecutor) driver1;
    js.executeScript("window.open('https://www.flipkart.com')");
    js.executeScript("window.open('https://www.amazon.com')");
    System.out.println(driver1.getTitle());
    
    
    
}
}
