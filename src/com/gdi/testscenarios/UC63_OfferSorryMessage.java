package com.gdi.testscenarios;

import com.gdi.locators.HomePageLocators;
import com.gdi.locators.OfferPageLocators;
import com.gdi.locators.ProfilePageLocators;
import com.gdi.useractions.ActionImplementation;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;

public class UC63_OfferSorryMessage {
	
	private static AndroidDriver androidDriver;
	private static ExtentTest testReport;
	
	public UC63_OfferSorryMessage(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		this.androidDriver = androidDriver;
		this.testReport = testReport;
		offerSorryMessage();
	}
	
	public static void offerSorryMessage() throws InterruptedException{
	
		try{
			ActionImplementation.click(HomePageLocators.offersModule(androidDriver), testReport, "offersModule");
			ActionImplementation.wait(androidDriver, OfferPageLocators.offerSorryPageWait(), testReport);
			ActionImplementation.verifyPresenceOfElement(OfferPageLocators.offerSorryPage(androidDriver), "offerSorryMessage", testReport);
			testReport.log(LogStatus.PASS, "The coupon has been applied ");
			}
			catch(Exception e){
			testReport.log(LogStatus.FAIL, "The coupon in the offer page still displayes");
			}
			
			}

		}
