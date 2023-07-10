package mini_project;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nykaa_project {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Java\\Review\\Cdriver\\chromedriver.exe");
		
				
				WebDriver driver = new ChromeDriver();			
		
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
			
			driver.get("https://www.nykaa.com/");
			
			WebElement signin = driver.findElement(By.xpath("//button[text()=\"Sign in\"]"));
			signin.click();
			
			WebElement mail = driver.findElement(By.xpath("//button[text()=\"Sign in with Mobile / Email\"]"));
			mail.click();
			
			WebElement user = driver.findElement(By.name("emailMobile"));
			user.sendKeys("9025852377");
			
			WebElement proceed = driver.findElement(By.id("submitVerification"));
			proceed.click();
			
			WebElement otp = driver.findElement(By.name("otpValue"));
			otp.click();
			//Thread.sleep(3000);
			
			WebElement verify = driver.findElement(By.xpath("//button[@type=\"submit\"] "));
			verify.click();
			System.out.println("Log in created successfully");
	       
           WebElement skin = driver.findElement(By.xpath("(//a[text()=\"skin\"])[2]"));
           
           Actions Av = new Actions(driver);
           Av.moveToElement(skin).build().perform();
           
           WebElement creams = driver.findElement(By.linkText("Night Cream"));
           creams.click();
           
           Set<String> windowHandles = driver.getWindowHandles(); 
           for(String s :windowHandles)
           {
         	  String title = driver.switchTo().window(s).getTitle();
         	  System.out.println(title);
           }

           
           //PRODUCT CLICK
           
         Actions ac=new Actions(driver);
         ac.doubleClick().build().perform();
         WebElement pdt = driver.findElement(By.xpath("(//div[@class=\"css-43m2vm\"])[21]"));
         Av.moveToElement(pdt).build().perform(); 
         
         

         WebElement pass = driver.findElement(By.xpath("(//span[@class=\"btn-text\"])[3]"));
         System.out.println( "before");
         ac.contextClick(pass).build().perform();
  
         System.out.println("after");
         
        WebElement bag = driver.findElement(By.xpath("//div[@class=\"css-0 e1ewpqpu1\"]"));
        ac.contextClick(bag).build().perform();

        System.out.println("bagselect");
	  
        WebElement count = driver.findElement(By.xpath("//span[@class='cart-count']"));
 		ac.moveToElement(count).build().perform();
 		ac.click().build().perform();

 		WebElement frame = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
 		driver.switchTo().frame(frame);

 		WebElement pro = driver.findElement(By.xpath("//span[text()='Proceed']"));
 		ac.moveToElement(pro).build().perform();
 		ac.click().build().perform();

 		WebElement address = driver.findElement(By.xpath("//p[text()='Add New Address']"));
 		ac.moveToElement(address).build().perform();
 		ac.click().build().perform();

 		Thread.sleep(500);
         
        WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
 		pincode.click();
 		pincode.sendKeys("628402");


		Thread.sleep(500);

		WebElement flatNo = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
		flatNo.click();
		flatNo.sendKeys("2H/708");

		Thread.sleep(500);
		
		WebElement area = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
		area.click();
		area.sendKeys("Annai Theresa Nagar");

		Thread.sleep(500);
		
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		name.click();
		name.sendKeys("Surya");

		WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		phone.click();
		phone.sendKeys("9025852377");

		Thread.sleep(500);

		WebElement gmail = driver.findElement(By.xpath("//input[@placeholder='Email ID (Optional)']"));
		gmail.click();
		gmail.sendKeys("surya123@gamil.com");
		
		WebElement delivery = driver.findElement(By.xpath("//p[text()='Cash on delivery']"));
		ac.moveToElement(delivery).build().perform();
		ac.click().build().perform();

		WebElement order = driver.findElement(By.xpath("//button[text()='Place order']"));
		ac.moveToElement(order).build().perform();
		ac.click().build().perform();

		System.out.println("NYKAA Order Placed Successfully..");
           
	      	        
}

}
