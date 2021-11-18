package sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SDET\\chromedriver\\chromedriver.exe");
	    WebDriver driver1 = new ChromeDriver();
	    driver1.get("https://google.com");
	    JavascriptExecutor js=(JavascriptExecutor) driver1;
	    js.executeScript("window.open('https://www.flipkart.com')");
	    js.executeScript("window.open('https://www.snapdeal.com')");
	    js.executeScript("window.open('https://www.myntra.com')");
	    js.executeScript("window.open('https://www.amazon.com')");
	    System.out.println(driver1.getTitle());
	    
	    String currentWindow=driver1.getWindowHandle();
	    System.out.println(currentWindow);
	    Set<String> str=driver1.getWindowHandles();
	    System.out.println(str.size());
	    Iterator<String> itr= str.iterator();
	    String parent = null;
		while(itr.hasNext()) {
	    	String child_window=I1.next();


	    	if(!parent.equals(child_window))
	    	{
	    	driver1.switchTo().window(child_window);

	    	System.out.println(driver1.switchTo().window(child_window).getTitle());

	    	driver1.close();
	    	}

	    	}
	    	//switch to the parent window
	    	driver1.switchTo().window(parent);
	    }
	    
	}


