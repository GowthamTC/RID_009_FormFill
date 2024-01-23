package com.ForMyPro;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DatePick {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		driver.findElement(By.xpath("//th[text()='May 2024']")).click();
		
		Thread.sleep(4000);
		WebElement dclick = driver.findElement(By.xpath("(//th[@class='next'])[1]"));
		Thread.sleep(4000);
		Actions a=new Actions(driver);
		a.moveToElement(dclick).perform();
		
			
	}

}
