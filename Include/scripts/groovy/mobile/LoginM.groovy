package mobile
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
import com.test.mobile.sehatq.LoginMObject
import com.test.web.sehatq.LoginObject

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



class LoginM {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	LoginMObject loginMobile = new LoginMObject()

	@Given("Users is on login screen mobile")
	def ClickIconLogin() {
		Mobile.startExistingApplication('com.she.sehatq')
		Mobile.delay(5)
		Mobile.waitForElementPresent(loginMobile.btnImageIconLogin(), 30)
		Mobile.delay(5)
		Mobile.tap(loginMobile.btnImageIconLogin(), 30)
	}

	@When("Users Do Input email mobile (.*)")
	def InputEmail(String email) {
		Mobile.tap(loginMobile.inputEmail(), 30)
		Mobile.setText(loginMobile.inputEmail(), email, 30)
	}

	@When("Users Inputs email mobile not yet register (.*)")
	def InputEmailNotRegistersMobile(String email) {
		Mobile.tap(loginMobile.inputEmail(), 30)
		Mobile.setText(loginMobile.inputEmail(), email, 30)
	}

	@When("Users Input wrong email mobile format input (.*)")
	def InputWrongEmailFormat(String email) {
		Mobile.tap(loginMobile.inputEmail(), 30)
		Mobile.setText(loginMobile.inputEmail(), email, 30)
	}

	@When("Users Do Input blank email mobile (.*)")
	def InputBlankEmail(String email) {
		Mobile.tap(loginMobile.inputEmail(), 30)
		Mobile.pressBack()
	}

	@And("Users Do Input password mobile (.*)")
	def InputPassword(String password) {
		Mobile.tap(loginMobile.inputPassword(), 30)
		Mobile.setText(loginMobile.inputPassword(), password, 30)
	}

	@And("Users Input wrong password mobile (.*)")
	def InputWrongPassword(String password) {
		Mobile.tap(loginMobile.inputPassword(), 30)
		Mobile.setText(loginMobile.inputPassword(), password, 30)
	}

	@And("Users Do Input blank password mobile (.*)")
	def InputBlankPassword(String password) {
		Mobile.tap(loginMobile.inputPassword(), 30)
		Mobile.pressBack()
	}

	@And("Users Input password mobile less than 6 characters (.*)")
	def InputPasswordLessThan(String password) {
		Mobile.tap(loginMobile.inputPassword(), 30)
		Mobile.pressBack()
	}

	@And("Users click button login Mobile")
	def ClickButtonLogin() {
		Mobile.pressBack()
		Mobile.tap(loginMobile.btnLogin(), 30)
	}

	@Then("Users Can See Showing alerts mobile (.*)")
	def ShowingInformation(String status) {
		if(status == 'Login berhasil') {
			Mobile.waitForElementPresent(loginMobile.btnHamburgerMenu(), 30)
			Mobile.tap(loginMobile.btnHamburgerMenu(), 30)
			Mobile.tap(loginMobile.btnPengaturanAplikasi(), 30)
			Mobile.tap(loginMobile.btnLogOut(), 30)
			Mobile.tap(loginMobile.btnLogOutYa(), 30)
			Mobile.comment(status)
		} else if(status == 'Email atau Password salah') {
			Mobile.waitForElementPresent(loginMobile.EmailAtauPasswordSalah(), 30)
			Mobile.verifyElementVisible(loginMobile.EmailAtauPasswordSalah(), 30)
			Mobile.tap(loginMobile.btnOkMessageAlert(), 30)
			Mobile.pressBack()
			Mobile.comment(status)
		} else if(status == 'Email harus diisi dengan benar') {
			Mobile.waitForElementPresent(loginMobile.EmailHarusDenganBenar(), 30)
			Mobile.verifyElementVisible(loginMobile.EmailHarusDenganBenar(), 30)
			Mobile.tap(loginMobile.btnOkMessageAlert(), 30)
			Mobile.pressBack()
			Mobile.comment(status)
		} else if(status == 'Masukkan Email Dengan Benar') {
			Mobile.waitForElementPresent(loginMobile.MasukkanEmailDenganBenar(), 30)
			Mobile.verifyElementVisible(loginMobile.MasukkanEmailDenganBenar(), 30)
			Mobile.pressBack()
			Mobile.comment(status)
		} else if(status == 'Password Minimal 6 Karakter') {
			Mobile.waitForElementPresent(loginMobile.PasswordMinimalEnamKarakter(), 30)
			Mobile.verifyElementVisible(loginMobile.PasswordMinimalEnamKarakter(), 30)
			Mobile.pressBack()
			Mobile.comment(status)
		} else {
			Mobile.comment('Tidak ada pilihan')
		}
	}
}