package com.Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Drop {

	
	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\Java\\Review\\Dchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement single=driver.findElement(By.id("fruits"));
		
		Select s = new Select(single);
		//s.selectByIndex(1);
		//s.selectByVisibleText("Pine Apple");
		s.selectByValue("3");
		System.out.println("Done");
		
		
	}
}
