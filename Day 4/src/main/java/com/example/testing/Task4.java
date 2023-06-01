package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4 {
	public static void main(String [] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url = "https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb" ;
    	driver.manage().window().maximize();
    	
//    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("shruthi");
    	driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("shruthi");
    	driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("41232705");
    	driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("chinni");
//    	JavascriptExecutor js = (JavacriptExecutor) driver ;
    	JavascriptExecutor js = (JavascriptExecutor) driver ;
    	js.executeScript("window.scrollBy(0,1000)", "") ;
    	
    	
    	
//    	
    	



    	
	}

}