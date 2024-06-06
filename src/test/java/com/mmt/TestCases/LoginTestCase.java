package com.mmt.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmt.base.BaseClass;

import PageObject.LoginPageObject;

public class LoginTestCase extends BaseClass {
	public LoginPageObject loginpagevar;

	@BeforeMethod
	public void initialize() {
		loginpagevar = new LoginPageObject();
	}

	@Test
	public void validLoginTest() throws InterruptedException {
		loginpagevar.loginwithvalidcreds();
	}

}