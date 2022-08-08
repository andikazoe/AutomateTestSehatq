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
import com.test.web.sehatq.LoginObject
import org.openqa.selenium.Keys as Keys
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



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	LoginObject login = new LoginObject()

	@Given("User is on login screen")
	def ClickIconLogin() {
		WebUI.openBrowser(GlobalVariable.LINK_LOGIN)
		WebUI.maximizeWindow()
	}

	@When("User Do Input email (.*)")
	def InputEmail(String email) {
		WebUI.waitForElementVisible(login.inputEmail(), 30)
		WebUI.doubleClick(login.inputEmail())
		WebUI.setText(login.inputEmail(), email)
	}

	@When("Users Do Input email not yet register (.*)")
	def InputEmailNotYetRegister(String email) {
		WebUI.waitForElementVisible(login.inputEmail(), 30)
		WebUI.doubleClick(login.inputEmail())
		WebUI.setText(login.inputEmail(), email)
	}

	@When("User Do Input wrong email format input (.*)")
	def InputWrongEmailFormat(String email) {
		WebUI.waitForElementVisible(login.inputEmail(), 30)
		WebUI.doubleClick(login.inputEmail())
		WebUI.setText(login.inputEmail(), email)
	}

	@When("User Do Input blank email")
	def InputBlankEmail() {
		WebUI.waitForElementVisible(login.inputEmail(), 30)
		WebUI.doubleClick(login.inputEmail())
		WebUI.sendKeys(login.inputEmail(), Keys.chord(Keys.CONTROL,'a'))
		WebUI.sendKeys(login.inputEmail(), Keys.chord(Keys.BACK_SPACE))
		WebUI.comment("Email Kosong")
	}

	@And("User Do Input password (.*)")
	def InputPassword(String password) {
		WebUI.doubleClick(login.inputPassword())
		WebUI.setText(login.inputPassword(), password)
	}

	@And("User Do Input wrong password (.*)")
	def InputWrongPassword(String password) {
		WebUI.doubleClick(login.inputPassword())
		WebUI.setText(login.inputPassword(), password)
	}

	@And("User Do Input blank password")
	def InputBlankPassword() {
		WebUI.waitForElementVisible(login.inputEmail(), 30)
		WebUI.doubleClick(login.inputPassword())
		WebUI.sendKeys(login.inputPassword(), Keys.chord(Keys.CONTROL,'a'))
		WebUI.sendKeys(login.inputPassword(), Keys.chord(Keys.BACK_SPACE))
		WebUI.comment("Password Kosong")
	}

	@And("Users Do Input password less than 6 characters (.*)")
	def InputPasswordlessThan(String password) {
		WebUI.doubleClick(login.inputPassword())
		WebUI.setText(login.inputPassword(), password)
	}

	@And("User Do click button login")
	def ClickButtonLogin() {
		WebUI.click(login.btnLogin())
	}

	@Then("User Can See Showing alerts (.*)")
	def ShowingAlerts(String status) {
		if(status == 'Login berhasil') {
			WebUI.verifyElementVisible(login.iconProfile())
			WebUI.click(login.iconProfile())
			WebUI.click(login.btnSignOut())
		} else {
			WebUI.verifyMatch((WebUI.getText(login.informationCondition(status)).toString()),status,false, FailureHandling.CONTINUE_ON_FAILURE)
		}
	}
}