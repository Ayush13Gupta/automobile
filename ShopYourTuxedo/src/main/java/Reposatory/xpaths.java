package Reposatory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpaths {
public  WebElement el = null;
	
	
	public  WebElement searchbox(WebDriver driver)
	{
	   el=driver.findElement(By.id("search"));
	 
	    
		return el;
		
	}
	public  WebElement searchbox_button(WebDriver driver)
	{
	   el=driver.findElement(By.name("submit-search"));
	 
	    
		return el;
		
	}
	// sanjay
	
	public  WebElement shortby(WebDriver driver)
	{
	   el=driver.findElement(By.xpath("//a[@href='#Price High-Low']"));
	 
	    
		return el;
		
	}
	public  WebElement firsttuxcedoinlist(WebDriver driver)
	{
	   el=driver.findElement(By.xpath("(//div[@class='prod_nameBlock']//p)[1]"));
	 
	    
		return el;
		
	}
	public  WebElement size_oftuxcedo(WebDriver driver)
	{
	   el=driver.findElement(By.id("size-dropdown"));
	 
	    
		return el;
		
	}
	public  WebElement quantity(WebDriver driver)
	{
	   el=driver.findElement(By.id("productQuantity"));
	 
	    
		return el;
		
	}
	public  WebElement addto_cart(WebDriver driver)
	{
	   el=driver.findElement(By.xpath("(//input[@id='addtobagID'])[1]"));
	 
	    
		return el;
		
	}

}
