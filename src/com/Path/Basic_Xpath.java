package com.Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Xpath 
{
	
	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\Java\\Review\\Dchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dgoogle%2Blogin%26rlz%3D1C1VDKB_enIN1029IN1029%26oq%3Dgoogle%2Blogin%26aqs%3Dchrome..69i57j0i131i433i512j0i512l8.5118j0j7%26sourceid%3Dchrome%26ie%3DUTF-8&hl=en&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
	
		//WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		//pass.sendKeys("12345678");
				

		//WebElement confirm = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		//confirm.sendKeys("12345678");
										
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?ifkv=AQMjQ7R2Urz_Zn2K623tN_7L5FwQ0OgxE1BX-88-90B3CKyQupq8k-jZDcQ-a6y9vQ2fhwI7f_Ch&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		WebElement confirm = driver.findElement(By.xpath("//input[contains(@aria-label,\"Email\")]"));
		confirm.sendKeys("surya@gmail.com");
		//Thread.sleep(20000);
		//confirm.clear();
		boolean p=confirm.isDisplayed();
		System.out.println(p);
		
		boolean enabled = confirm.isEnabled();
		System.out.println(enabled);
		
		boolean selected = confirm.isSelected();
		System.out.println(selected);
	}
}
				
				