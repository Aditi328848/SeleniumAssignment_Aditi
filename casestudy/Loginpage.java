package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;

	By userName = By.id("txtUsername");
	By passwd = By.id("txtPassword");
	By loginBtn = By.id("btnLogin");
	By forgotPswdLnk = By.linkText("Forgot your password?");

	public void LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setUserName(String user) {
		driver.findElement(userName).sendKeys(user);
	}

	public void setPassword(String pswd) {
		driver.findElement(passwd).sendKeys(pswd);
	}

	public void clickOnLoginBtn() {
		driver.findElement(loginBtn).click();
	}

	public void clickOnForgotLink() {
		driver.findElement(forgotPswdLnk).click();
	}
}
