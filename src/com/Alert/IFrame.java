package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame 
{
	public static void main(String[] args)

	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\Java\\Review\\Dchrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	WebElement NestFrame = driver.findElement(By.xpath("//input[@href="#Multiple"]")[2]);
	NestFrame.click();
	System.out.println("Done");
	
	}

}
