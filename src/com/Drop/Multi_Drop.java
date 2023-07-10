package com.Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Drop {
	
	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\Java\\Review\\Dchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement multi =driver.findElement(By.id("superheros"));
		Select m = new Select(multi);
		boolean multiple = m.isMultiple();
		System.out.println(multiple);	
		m.selectByVisibleText("The Avengers");
		m.selectByVisibleText("Batmam");
		m.selectByVisibleText("Aquaman");
		//m.deselectByIndex(2);
		System.out.println(m);
		
		
	}

}
