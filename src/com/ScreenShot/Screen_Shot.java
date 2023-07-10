package com.ScreenShot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Shot 
{
	
	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\Java\\Review\\Dchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		TakeScreenshot ts=(TakeScreenshot)driver;
		File screenshotAs=ts.getScreenshotAs(OutputType.FILE);
		File locs=new File("C:\\Users\\Lenovo\\Desktop\\Java\\Review\\Dchrome\\Screen\\screenshot.png");
		FileHandler.copy(screenshotAs, locs);
		System.out.println("Done");
	}

}
