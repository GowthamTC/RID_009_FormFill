package com.ForMyPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='checkbox-1']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkbox-2']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkbox-3']")).click();
		
	}

}
