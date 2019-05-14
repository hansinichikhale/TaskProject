package com.javabykiran;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadpropertiesFile {

	public static void main(String[] args) throws Throwable {
		 WebDriver driver = null;
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\Public\\ExcelSheetAndPropertyFile\\src\\com\\javabykiran\\confg.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String url=prop.getProperty("url");
		System.out.println(url);
		String browsername=prop.getProperty("browser");
		System.out.println(browsername);
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan\\Downloads\\chromedriver.exe");
			 driver=new ChromeDriver();
	}
		else if(browsername.equals("ff")) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Pavan\\Downloads\\gecko\\geckodriver.exe");
  driver=new FirefoxDriver();
}
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.id(prop.getProperty("firstName_id"))).sendKeys("firstName");
		driver.findElement(By.id(prop.getProperty("lastName_id"))).sendKeys("last_35");
		driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys("Email");
		driver.findElement(By.id(prop.getProperty("Area code_id"))).sendKeys("postal");
		driver.findElement(By.id(prop.getProperty("phone num_id"))).sendKeys("phone");
		driver.findElement(By.id(prop.getProperty("street add_id"))).sendKeys("Adress1");
		driver.findElement(By.id(prop.getProperty("street addline2_id"))).sendKeys("Adress2");
		driver.findElement(By.id(prop.getProperty("city_id"))).sendKeys("cityname");
		driver.findElement(By.id(prop.getProperty("state_id"))).sendKeys("statename");
		driver.findElement(By.id(prop.getProperty("zipcode_id"))).sendKeys("zpcode");
		driver.findElement(By.id(prop.getProperty("country_id"))).sendKeys("countryname");
		
		
		
}}