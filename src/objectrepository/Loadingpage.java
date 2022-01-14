package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loadingpage {
	
	WebDriver driver;
	public Loadingpage(WebDriver driver) {
		this.driver=driver;
		
	}
	By username =By.xpath(".//*[@id='login1']");
	By passwrod = By.xpath("//*[@id=\"password\"]");
	By signin = By.name("proceed");
	By error = By.id("div_login_error");
	By website = By.linkText("href=\'https://www.rediff.com\'");
	
	public WebElement Email()
	{
		return driver.findElement(username);
	}
	
	public WebElement passcode()
	{
		return driver.findElement(passwrod);
	}

	public WebElement submit()
	{
		return driver.findElement(signin);
}
	public WebElement Error()
	{
		return driver.findElement(error);
}
	public WebElement Link()
	{
		return driver.findElement(website);
}
}

