package com.tesecases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.QA.Beacon;
import com.QA.LogIn;

public class DeleteBeacon {
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
		
		Beacon b = new Beacon(driver);
		b.DeleteBeacon();
		
	}	
}
