package myfirtproj;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeBrowserTesting {
	

	static WebDriver driver;
	static WebElement var1,var2,var3;
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
	               "/Users/pavithra/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://www.mycontactform.com/");
		
		//Page1:
		driver.findElement(By.id("user")).sendKeys("Prabhu123");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
		driver.findElement(By.cssSelector("#right_col_top > form > div > input")).click();
		driver.findElement(By.xpath("//*[@id='user_bar']/ul/li[2]/a")).click();
		driver.findElement(By.name("submit")).click();
		
		//Page2:
		Scanner sc = new Scanner (System.in);
		String formname = sc.next();
		
		driver.findElement(By.name("formname")).sendKeys(formname);
		

		WebElement var1 = driver.findElement(By.xpath("//*[@id='format']"));
		new Select(var1).selectByVisibleText("Plain Text");
		WebElement var2 = driver.findElement(By.xpath("//*[@id='empty']"));
		new Select(var2).selectByVisibleText("Yes");
		WebElement var3 = driver.findElement(By.xpath("//*[@id='printurl']"));
		new Select(var3).selectByVisibleText("No");
		driver.findElement(By.cssSelector("#Submit")).click();
	
		//Page3:
		driver.findElement(By.xpath("//*[@id='Submit']")).click();
		
		//Page4:
		driver.findElement(By.id("addemail")).click();
		driver.findElement(By.name("newemail")).sendKeys("satishselvan@gmail.com");
		driver.findElement(By.xpath("//*[@id='center_col']/form/div[2]/input")).click();

	}

	
}
	