package com.GenericFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public  class CommanFunction {
	public static WebDriver driver;
	
	public static boolean browser_declaration(String browser) {
		//**********************
		//Browser Declaration*******************//
		
		
		boolean status=true;
		switch ("browser.toLowerCase()") {
		case "ie":
			driver=new InternetExplorerDriver();
			driver.get("www.gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
			break;
		
		case "FF":
			driver=new FirefoxDriver();
			driver.get("www.gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		break;

		
		case "Chrome":
			
			driver=new ChromeDriver();
			driver.get("www.gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		break;


		default:
			break;
		}
		return status;

	}

}

