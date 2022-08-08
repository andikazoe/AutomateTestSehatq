package com.test.web.sehatq

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.test.basepageobject.BasePageObject

import internal.GlobalVariable

public class LoginObject extends BasePageObject {

	private TestObject btnImageIconLogin
	private TestObject inputEmail
	private TestObject inputPassword
	private TestObject btnLogin
	private TestObject iconProfile
	private TestObject btnSignOut
	private TestObject informationCondition

	public TestObject btnImageIconLogin(){
		btnImageIconLogin = createTestObjectByID("btnImageIconLogin", "popover-profile")
	}

	public TestObject inputEmail(){
		inputEmail = createTestObjectByXpath("inputEmail", "//input[@id='email']")
	}

	public TestObject inputPassword(){
		inputPassword = createTestObjectByXpath("inputPassword", "//input[@name='password']")
	}

	public TestObject btnLogin(){
		btnLogin = createTestObjectByXpath("btnLogin", "//*/text()[normalize-space(.)='Login']/parent::*")
	}

	public TestObject iconProfile(){
		iconProfile = createTestObjectByID("iconProfile", "popover-profile")
	}

	public TestObject btnSignOut(){
		btnSignOut = createTestObjectByXpath("btnSignOut", "//*/text()[normalize-space(.)='Sign Out']/parent::*")
	}

	public TestObject informationCondition(Message){
		informationCondition = createTestObjectByXpath("informationCondition", "//*/text()[normalize-space(.)='${Message}']/parent::*")
	}
}
