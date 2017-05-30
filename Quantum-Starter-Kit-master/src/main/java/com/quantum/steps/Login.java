package com.quantum.steps;

import java.io.ObjectInputStream.GetField;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.quantum.java.pages.CaretrailTestPage;

public class Login  extends WebDriverTestBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		CaretrailTestPage c=new CaretrailTestPage();
		c.launchPage(null);
		c.getEmailEmailAddress().sendKeys("Perfecto1@caretrail.io");
		c.getPasswordPassword().sendKeys("CareTrail2017!");
		c.getSpanSpan().click();
	}

}
