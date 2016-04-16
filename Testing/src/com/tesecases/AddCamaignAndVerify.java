package com.tesecases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.QA.Campaign;
import com.QA.LogIn;

public class AddCamaignAndVerify {
WebDriver driver;
	
	@Test 
	//This method will login in, add compaign and return total number of compaign in console.
	public void App() 
	{ 
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("https://manage.sensorberg.com/#/signin");
		
		LogIn loginPage = new LogIn(driver); 		
		loginPage.Login("fazi.g117@gmail.com", "Software123");
		
		Campaign cam = new Campaign(driver);
		cam.campaign();
		cam.AddCompaign("Testing", "Whatever the subject would be..."," And the body descripion" );
		
		cam.VerifyCompaign();
	}	
	
	
}
