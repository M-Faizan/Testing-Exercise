package com.QA;

import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Beacon {
	WebDriver driver;
	
	   public Beacon(WebDriver driver) 
		
		{
			this.driver=driver;
		}
	   
	   By Beacon=By.xpath("/html/body/div[1]/bm-navigation/div/ul/li[2]/a"); 
	   By AddButton=By.xpath("/html/body/div[1]/div/section/div/bm-list-table/div/h3/bm-create-link/a/span");
	   
	 //This function will be access from AddBeaconTest, it will log in and will Add Beacon
	   
	   public void beacon()  {	 
			
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
			    driver.findElement(Beacon).click();	 
		        driver.findElement(AddButton).click();
				
		  }
		 public void AddBeacon(String name, String description)  {	 
				
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 By Name=By.xpath("/html/body/div[1]/div/section/div/div/div[2]/div/form/fieldset[1]/div[1]/input"); 
			 By Description=By.xpath("/html/body/div[1]/div/section/div/div/div[2]/div/form/fieldset[1]/div[2]/textarea");
			 By UUID=By.xpath("/html/body/div[1]/div/section/div/div/div[2]/div/form/fieldset[2]/div[2]/select");	
			 By SelectUUID=By.xpath("/html/body/div[1]/div/section/div/div/div[2]/div/form/fieldset[2]/div[2]/select/option[4]");	
	         By Save=By.xpath("/html/body/div[1]/div/section/div/div/div[2]/div/form/fieldset[4]/div/button[1]");
			   
	            driver.findElement(Name).sendKeys(name);	           
			 	driver.findElement(Description).sendKeys(description);			 	
			 	driver.findElement(UUID).click();			 	 
		        driver.findElement(SelectUUID).click();		        
		        driver.findElement(Save).submit();
		  }
		 public void VerifyBeacon()  {		
			  	           	 
	           WebElement element= driver.findElement(By.xpath("/html/body/div[1]/div/section/div/bm-list-table/div/h3/span[2]"));
	   		   System.out.println("Total Number of Beacon  = " +element.getText());					
	   		   JOptionPane.showMessageDialog(null,"Kindly look at console for more information, Thanks");
				
		  }
		 public void DeleteBeacon()  {
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			    driver.findElement(Beacon).click();	
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    By Delete1=By.xpath("/html/body/div[1]/div/section/div/bm-list-table/section/div[2]/div/table/tbody/tr/td[1]/input"); 
			    By Delete2=By.xpath("/html/body/div[1]/div/section/div/bm-list-table/section/div[1]/ul/li/bm-confirm/a"); 
			    By Delete3=By.xpath("/html/body/div[5]/div/div/div[3]/button[1]"); 			    	
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    driver.findElement(Delete1).click();	
			    driver.findElement(Delete2).click();
			    driver.findElement(Delete3).click();
				
		  }
		 
		 
}
