package com.ForMyPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoFill {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		// TC_001===	Scenario==1 ---> Form Fill
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[1]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("dubaiMainroad");
		
		WebElement stradd = driver.findElement(By.xpath("//input[@id='street_number']"));
		stradd.sendKeys("stNo-001");
		driver.findElement(By.xpath("//input[@id='route']")).sendKeys("add-2");
		driver.findElement(By.xpath("//input[@id='locality']")).sendKeys("Chidambaram");
		driver.findElement(By.xpath("//input[@id='administrative_area_level_1']")).sendKeys("TN");
		driver.findElement(By.xpath("//input[@id='postal_code']")).sendKeys("600028");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("india");	
	
		// TC_002===	Scenario==2-----> Button
		
		driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[2]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='btnGroupDrop1']")).click();
		
		driver.findElement(By.xpath("(//a[@class='dropdown-item'])[16]")).click();
	}

}
