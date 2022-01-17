package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.Loadingpage;
import objectrepository.LoadingpagePF;

public class Loginpage {
	
	@Test
	public void Login() {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LoadingpagePF pg =new LoadingpagePF(driver);
		pg.Email().sendKeys("hello");
		pg.passcode().sendKeys("hello");
		pg.submit().click();
		System.out.println(pg.Error().getText());
		System.out.println("naga sai");
		System.out.println("Sai");
		
	}

}
