package omayo_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo_Blogspot
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("wedriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\AUTOMATION TESTING\\Browser Extension\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/textarea")).sendKeys("The cat was playing in the garden");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[2]/div[1]/div/form/table/tbody/tr/td[1]/input")).sendKeys("selenium143");	
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[2]/div[1]/div/form/table/tbody/tr/td[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"radio2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"alert1\"]")).click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[5]/div[1]/input[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[5]/div[1]/input[2]")).sendKeys("Anna");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[5]/div[1]/a")).click();
		driver.navigate().back();
		
		driver.close();
		
		
	}

}
