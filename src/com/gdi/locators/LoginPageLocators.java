package com.gdi.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.appium.java_client.android.AndroidDriver;

public class LoginPageLocators {
					
		public static String createAccountForWait(){
			return "//android.widget.TextView[@text='Join to earn badges and collect rewards.']";
		}
		
		public static String wrongPwdValidationMsgWait(){
			return "//android.widget.TextView[@text='Please enter valid email address and password']";
		}
		public static String joinStaticTextWait(){
		return "//android.widget.TextView[@text='Join to earn badges and collect rewards.']";
		}
		public static WebElement loginTab(AndroidDriver androidDriver){
				return androidDriver.findElementByAccessibilityId("loginScreen_loginSelectorButton");
		}
		public static WebElement enterYourEmail(AndroidDriver androidDriver){
			try{
				return androidDriver.findElementByAccessibilityId("loginScreen_emailContainer").findElement(By.className("android.view.ViewGroup")).findElement(By.className("android.widget.EditText"));
			}
			catch (Exception e) {
				return androidDriver.findElementByAccessibilityId("loginScreen_emailContainer").findElement(By.className("android.view.View")).findElement(By.className("android.widget.EditText"));
			}
		}
		
		public static WebElement enterYourPassword(AndroidDriver androidDriver){
			try{
				return androidDriver.findElementByAccessibilityId("loginScreen_passwordContainer").findElements(By.className("android.view.ViewGroup")).get(0).findElement(By.className("android.widget.EditText"));
			}
			catch(Exception e){
				return androidDriver.findElementByAccessibilityId("loginScreen_passwordContainer").findElements(By.className("android.view.View")).get(0).findElement(By.className("android.widget.EditText"));
			}
		}
		
		public static WebElement joinToEarnStaticText(AndroidDriver androidDriver){
			return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Join to earn badges and collect rewards.']"));
		}
		
		public static WebElement letsGoButton(AndroidDriver androidDriver){
			try{
				return androidDriver.findElementByAccessibilityId("loginScreen_loginContainer").findElements(By.className("android.view.ViewGroup")).get(0);
			}
			catch(Exception e){
				return androidDriver.findElementByAccessibilityId("loginScreen_loginContainer").findElements(By.className("android.view.View")).get(0);
			}
		}	
		
		public static WebElement skipforNowLink(AndroidDriver androidDriver){
			//return androidDriver.findElementByAccessibilityId("loginScreen_loginContainer").findElements(By.className("android.view.ViewGroup")).get(2);
			return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Skip for now']"));
		}	
		
		public static WebElement wrongPwdValidationMsg(AndroidDriver androidDriver){
			return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Please enter valid email address and password']"));
		}
	
	}


