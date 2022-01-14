package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoadingpagePF {
	
	WebDriver driver;
	public LoadingpagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath=".//*[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\'password\']")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement signin;
	
	@FindBy(id="div_login_error")
	WebElement error;
	
	
	public WebElement Email()
	{
		return username;
	}
	
	public WebElement passcode()
	{
		return password;
	}

	public WebElement submit()
	{
		return signin;
}
	public WebElement Error()
	{
		return error;
}
	
}

