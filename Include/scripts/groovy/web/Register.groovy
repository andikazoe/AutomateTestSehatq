package web
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.test.web.sehatq.RegisterObject

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	RegisterObject register = new RegisterObject()

	@Given("User is on Register screen")
	def ClickIconLogin() {
		WebUI.openBrowser(GlobalVariable.LINK_REGISTER)
		WebUI.maximizeWindow()
	}

	@When("User Input full name (.*)")
	def InputFullname(String fullname) {
		WebUI.waitForElementVisible(register.inputFullname(), 30)
		WebUI.doubleClick(register.inputFullname())
		WebUI.setText(register.inputFullname(), fullname)
		WebUI.comment("Fullname Ada")
	}

	@When("User Input blank full name")
	def InputBlankFullname() {
		WebUI.waitForElementVisible(register.inputFullname(), 30)
		WebUI.comment("Fullname Kosong")
	}

	@And("User Input email (.*)")
	def InputEmail(String email) {
		WebUI.doubleClick(register.inputEmail())
		WebUI.setText(register.inputEmail(), email)
		WebUI.comment("Email Ada")
	}

	@And("User Input blank email")
	def InputBlankEmail() {
		WebUI.comment("Email Kosong")
	}

	@And("User input Email does not match (.*)")
	def InputEmailDoesNotMatch(String email) {
		WebUI.doubleClick(register.inputEmail())
		WebUI.setText(register.inputEmail(), email)
		WebUI.comment("Email does not match")
	}

	@And("User input email already registered (.*)")
	def InputEmailAlready(String email) {
		WebUI.doubleClick(register.inputEmail())
		WebUI.setText(register.inputEmail(), email)
		WebUI.comment("Email Already Registered")
	}

	@And("User Input password (.*)")
	def InputPassword(String password) {
		WebUI.doubleClick(register.inputPassword())
		WebUI.setText(register.inputPassword(), password)
		WebUI.comment("Password Ada")
	}

	@And("User Input blank password")
	def InputBlankPassword() {
		WebUI.comment("Password Kosong")
	}

	@And("User input password less more than 6 (.*)")
	def InputPasswordLessMoreThanSix(String password) {
		WebUI.doubleClick(register.inputPassword())
		WebUI.setText(register.inputPassword(), password)
		WebUI.comment("Password less more than 6")
	}

	@And("User checkbox Terms and Privacy Policy")
	def ClickTermsPolicy() {
		WebUI.click(register.checkboxTermsPolicy())
	}

	@And("User click button daftar")
	def ClickButtonDaftar() {
		WebUI.click(register.btnDaftar())
	}

	@Then("User Can See Showing alert (.*)")
	def ShowingToSeeAlertsRegister(String status) {
		if(status == 'Login berhasil') {
			WebUI.waitForElementPresent(register.btnImageIconLogin(), 30)
			WebUI.click(register.btnImageIconLogin())
			WebUI.click(register.btnSignOut())
			WebUI.comment(status)
		} else {
			WebUI.verifyMatch((WebUI.getText(register.TextInformation(status)).toString()),status,false, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.comment(status)
		}
	}
}


