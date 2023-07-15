package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
     System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\AUTOMATION TESTING\\Browser Extension\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     Thread.sleep(2000);
    driver.get("https://www.saucedemo.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
  
    driver.findElement(By.id("login-button")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")).click();
   
    
  
   

	}

}
