package com.WebFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Webfunctions  {

			//UserName
			@FindBy(how=How.ID,using="identifierId")
			public static WebElement Username;
			//NextButton
			@FindBy(how=How.ID,using="identifierNext")
			public static WebElement Next1;
			//Password
			@FindBy(how=How.NAME,using="password")
			public static WebElement Password;
			//LoginButton
			@FindBy(how=How.ID,using="passwordNext")
			public static WebElement Next2;




	public static boolean login() {
		
		boolean status=true;
		try
		{
			Username.click();
			Username.clear();
			Username.sendKeys("mrafishaik9848@gmail.com");
		}
		
		catch(Exception e) {
			status=false;
		}
		//////NEXT1 BUTTON
		if(status) {
			try {
				Next1.click();
	}
			catch(Exception e) {
				status=false;
	}
			
	}
////////Password Field//////////
		if(status)
		{
		try
		{
		Password.click();
		Password.clear();
		Password.sendKeys("9848321787");
		
	}
		catch(Exception e) {
			status=false;
	}

	}
		
		
	////////	Next2 Button///////////
		if(status)
		{
			try
			{
				Next2.click();
			}
			catch(Exception e)
			{
			status=false;	
			}
		}
		return status;
	
	}

}
