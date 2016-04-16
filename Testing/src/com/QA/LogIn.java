package com.QA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {
	
WebDriver driver;
	
   public LogIn(WebDriver driver) 
	
	{
		this.driver=driver;
	}
	 	    
     //This function will be access from Login Test class, use for submitting values for log in
	 
	public void Login(String userid, String pass)
	  {
				 
		 By Email=By.xpath("/html/body/div[1]/div/section/section/section[2]/div[2]/form/fieldset/div[1]/input"); 
	 	 
		 By password =By.xpath("/html/body/div[1]/div/section/section/section[2]/div[2]/form/fieldset/div[2]/input");
			 
		 By submit =By.xpath("/html/body/div[1]/div/section/section/section[2]/div[2]/form/fieldset/div[4]/button"); 
		  
		 	driver.findElement(Email).sendKeys(userid);	 
		 	driver.findElement(password).sendKeys(pass);
		 	driver.findElement(submit).click();
	  	  }
	
	
}
