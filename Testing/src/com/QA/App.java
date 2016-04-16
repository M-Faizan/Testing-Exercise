package com.QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class App {
	WebDriver driver;
	
	   public App(WebDriver driver) 
		
		{
			this.driver=driver;
		}
	   
	    By App=By.xpath("/html/body/div[1]/bm-navigation/div/ul/li[1]/a/span"); 
		By AddButton=By.xpath("/html/body/div[1]/div/section/div/bm-list-table/div/h3/bm-create-link/a/span");
		
	 //This function will be access from AddAppTest, it will log in and will  Add App feature	
		 public void app()  {	 
		
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.findElement(App).click();	 
		     driver.findElement(AddButton).click();
				
		  }
		 public void AddApp(String name, String description)  {	 
				
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 By Name=By.xpath("/html/body/div[1]/div/section/div/section/div/form/fieldset/div[1]/input"); 
			 By Description=By.xpath("/html/body/div[1]/div/section/div/section/div/form/fieldset/div[2]/textarea");
			 By OS=By.xpath("/html/body/div[1]/div/section/div/section/div/form/fieldset/div[4]/div/label[1]/input");	
			 By Save=By.xpath("/html/body/div[1]/div/section/div/section/div/form/fieldset/div[6]/button[1]");
			   
	            driver.findElement(Name).sendKeys(name);	           
			 	driver.findElement(Description).sendKeys(description);			 	
			 	driver.findElement(OS).click(); 			             
		        driver.findElement(Save).submit();
		  }
		 
		 public void DeleteAp()  {
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			    driver.findElement(App).click();	
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    By Delete1=By.xpath("/html/body/div[1]/div/section/div/bm-list-table/section/div[2]/div/table/tbody/tr/td[1]/input"); 
			    By Delete2=By.xpath("/html/body/div[1]/div/section/div/bm-list-table/section/div[1]/ul/li/bm-confirm/a"); 
			    By Delete3=By.xpath("/html/body/div[5]/div/div/div[3]/button[1]"); 			    	
			    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			    driver.findElement(Delete1).click();	
			    driver.findElement(Delete2).click();
			    driver.findElement(Delete3).click();
				
		  }
		
			
			
		
}