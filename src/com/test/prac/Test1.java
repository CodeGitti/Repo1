package com.test.prac;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Documents\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		/*
		 * d.get("https://www.facebook.com/"); d.manage().window().maximize();
		 * //d.findElement(By.partialLinkText("Forgotten")).click();
		 * d.findElement(By.xpath("//input[@type='email']")).sendKeys("hfjh");
		 * d.findElement(By.cssSelector("input[type='password']")).sendKeys("sjdhgfiu");
		 * d.findElement(By.xpath("//input[@value='Log In']")).click();
		 */
		
		/*
		 * d.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		 * d.manage().window().maximize(); Select s=new
		 * Select(d.findElement(By.id("select-demo"))); s.selectByVisibleText("Friday");
		 * d.close();
		 */
		d.get("https://www.spicejet.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		d.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[3]/li[2]/a")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//*[@id=\"dropdownGroup1\"]/div/ul[4]/li[3]/a)[2]")).click();
	}

}
