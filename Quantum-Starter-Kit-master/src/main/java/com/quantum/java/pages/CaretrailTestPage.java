package com.quantum.java.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class CaretrailTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "email.email.address")
	private QAFWebElement emailEmailAddress;
	@FindBy(locator = "password.password")
	private QAFWebElement passwordPassword;
	@FindBy(locator = "span.span")
	private QAFWebElement spanSpan;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
		driver.get("https://login.caretrail.io/login/#/auth/login");
	}
	

	public QAFWebElement getEmailEmailAddress() {
		return emailEmailAddress;
	}

	public QAFWebElement getPasswordPassword() {
		return passwordPassword;
	}

	public QAFWebElement getSpanSpan() {
		return spanSpan;
	}

}
