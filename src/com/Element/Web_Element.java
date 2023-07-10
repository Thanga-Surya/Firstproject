package com.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\Java\\Review\\Dchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dgoogle%2Blogin%26rlz%3D1C1VDKB_enIN1029IN1029%26oq%3Dgoogle%2Blogin%26aqs%3Dchrome..69i57j0i131i433i512j0i512l8.5118j0j7%26sourceid%3Dchrome%26ie%3DUTF-8&hl=en&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement user1=driver.findElement(By.id("firstName"));
		user1.sendKeys("Thanga");
		
		WebElement user2=driver.findElement(By.id("lastName"));
		user2.sendKeys("Surya");
		
		WebElement idname=driver.findElement(By.name("Username"));
		idname.sendKeys("surya123");
		
	}

}
