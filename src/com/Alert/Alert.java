package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\Java\\Review\\Dchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		WebElement simple = driver.findElement(By.id("OkTab"));
		simple.click();
		driver.switchTo().alert().accept();
		//System.out.println( "Simple Alert Done");
		
		//WebElement okCancel = driver.findElement(By.Xpath("//a[text()="Alert with OK & Cancel"]"));
		//okCancel.click();

		WebElement confirm = driver.findElement(By.id("CancelTab"));
		confirm.click();
		driver.switchTo().alert().dismiss();
		System.out.println( "Confirm Alert Done");
		
		WebElement prompt = driver.findElement(By.id("CancelTab"));
		prompt.click();
		driver.switchTo().alert().sendKeys("surya");
		driver.switchTo().alert().accept();
		System.out.println( "prompt Alert Done");
		
		
	}

}
