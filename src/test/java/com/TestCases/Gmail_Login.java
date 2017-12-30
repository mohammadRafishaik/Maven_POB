package com.TestCases;

import org.openqa.selenium.support.PageFactory;

import com.GenericFunction.CommanFunction;
import com.WebFunctions.Webfunctions;
public class Gmail_Login extends CommanFunction{
//public class Gmail_Login extends Webfunctions {
	
	public static void G_L() {
		/////////Set Browser
		CommanFunction cf=new CommanFunction();
		cf.browser_declaration("FF");
	
		
		//////////Set Credentials//////////
		login lg=PageFactory.initElements(driver, login.class);
		boolean status=lg.login();
		System.out.println("status");
	}
		
	}
	
		
	


