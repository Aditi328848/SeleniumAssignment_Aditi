package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Organisationpage {
	WebDriver driver;
	public void OrganizationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By organizatioName=By.xpath("//*[@id='organization_name']");
	By noOfEmp=By.xpath("//*[@id='numOfEmployees']");
	By orgEmail=By.xpath("//*[@id='organization_email']");

}
