package sample;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SDET\\chromedriver\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://google.com");
	}

	}


