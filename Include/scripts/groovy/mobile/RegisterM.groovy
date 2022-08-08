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
import com.test.mobile.sehatq.RegisterMObject

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



class RegisterM {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	RegisterMObject registermobile = new RegisterMObject()

	@Given("Users is on Register screen")
	def ClickIconLogin() {
		Mobile.startExistingApplication('com.she.sehatq')
		Mobile.waitForElementPresent(registermobile.btnImageIconLogin(), 30)
		Mobile.delay(5)
		Mobile.tap(registermobile.btnImageIconLogin(), 30)
		Mobile.tap(registermobile.btnDaftarLogin(), 30)
	}

	@When("Users Input full name (.*)")
	def InputFullname(String fullname) {
		Mobile.tap(registermobile.inputNamaLengkap(), 30)
		Mobile.setText(registermobile.inputNamaLengkap(), fullname, 30)
	}

	@When("Users Input blank full name (.*)")
	def InputBlankFullname(String fullname) {
		Mobile.tap(registermobile.inputNamaLengkap(), 30)
	}

	@And("Users Input email (.*)")
	def InputEmail(String email) {
		Mobile.tap(registermobile.inputEmail(), 30)
		Mobile.setText(registermobile.inputEmail(), email, 30)
	}

	@And("Users Input blank email (.*)")
	def InputBlankEmail(String email) {
		Mobile.tap(registermobile.inputEmail(), 30)
	}

	@And("Users Input Email already registered (.*)")
	def InputEmailAlreadyRegistered(String email) {
		Mobile.tap(registermobile.inputEmail(), 30)
		Mobile.setText(registermobile.inputEmail(), email, 30)
	}

	@And("Users Input password (.*)")
	def InputPassword(String password) {
		Mobile.tap(registermobile.inputPassword(), 30)
		Mobile.setText(registermobile.inputPassword(), password, 30)
	}

	@And("Users Input blank password (.*)")
	def InputBlankPassword(String password) {
		Mobile.tap(registermobile.inputPassword(), 30)
	}

	@And("Users Input Password less more than 6 (.*)")
	def InputPasswordLessMoreThanSix(String password) {
		Mobile.tap(registermobile.inputPassword(), 30)
		Mobile.setText(registermobile.inputPassword(), password, 30)
	}

	@And("Users checkbox Terms and Privacy Policy")
	def ClickTermsAndPolicy() {
		Mobile.pressBack()
		Mobile.tap(registermobile.btnCheckbox(), 30)
	}

	@And("Users click button daftar")
	def ClickButtonLogin() {
		Mobile.tap(registermobile.btnDaftarRegister(), 30)
	}

	@Then("Users Can See Showing information (.*)")
	def ShowingInformation(String status) {
		if(status == 'Login berhasil') {
			Mobile.waitForElementPresent(registermobile.btnLewati(), 30)
			Mobile.tap(registermobile.btnLewati(), 30)
			Mobile.tap(registermobile.btnLewatiYA(), 30)
			Mobile.tap(registermobile.btnHamburgerMenu(), 30)
			Mobile.tap(registermobile.btnPengaturanAplikasi(), 30)
			Mobile.tap(registermobile.btnLogOut(), 30)
			Mobile.tap(registermobile.btnLogOutYa(), 30)
			Mobile.comment(status)
		} else if(status == 'Nama Lengkap Kosong') {
			Mobile.verifyElementVisible(registermobile.NameMustBeFilled(), 30)
			Mobile.pressBack()
			Mobile.comment(status)
		} else if(status == 'Email Kosong') {
			Mobile.verifyElementVisible(registermobile.MasukkanEmailValid(), 30)
			Mobile.pressBack()
			Mobile.comment(status)
		} else if(status == 'Password Kosong') {
			Mobile.verifyElementVisible(registermobile.PasswordMustBeFilled(), 30)
			Mobile.pressBack()
			Mobile.comment(status)
		} else if(status == 'Password Minimal 6 Karakter') {
			Mobile.waitForElementPresent(registermobile.PasswordMinimalEnamKarakter(), 30)
			Mobile.verifyElementVisible(registermobile.PasswordMinimalEnamKarakter(), 30)
			Mobile.pressBack()
			Mobile.comment(status)
		} else if(status == 'Email already registered') {
			Mobile.waitForElementPresent(registermobile.EmailSudahAda(), 30)
			Mobile.verifyElementVisible(registermobile.EmailSudahAda(), 30)
			Mobile.tap(registermobile.btnOkMessageAlert(), 30)
			Mobile.pressBack()
			Mobile.comment(status)
		} else {
			Mobile.comment('Tidak ada pilihan')
		}
	}
}