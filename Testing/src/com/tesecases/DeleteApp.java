package com.tesecases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.QA.App;
import com.QA.LogIn;

public class DeleteApp {
	WebDriver driver;

	@Test 
	//This method will use for login and add app feature
	public void delete() 
	{ 
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("https://manage.sensorberg.com/#/signin");
	
		LogIn loginPage = new LogIn(driver); 		
		loginPage.Login("fazi.g117@gmail.com", "Software123");
				
		App a=new App(driver);
		a.DeleteAp();
	}	
}
