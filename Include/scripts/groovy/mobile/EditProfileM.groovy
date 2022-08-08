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
import com.test.mobile.sehatq.EditProfileObject
import com.test.mobile.sehatq.LoginMObject

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



class EditProfileM {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	EditProfileObject editProfile = new EditProfileObject()

	@Given("Users is on Profile Page")
	def ClickIconLogin() {
		Mobile.startExistingApplication('com.she.sehatq')
		Mobile.delay(5)
		Mobile.waitForElementPresent(editProfile.btnImageIconLogin(), 30)
		Mobile.delay(5)
		Mobile.tap(editProfile.btnImageIconLogin(), 30)
	}

	@When("Users click button edit profil")
	def ClickEditProfile() {
		Mobile.waitForElementPresent(editProfile.btnLihatProfil(), 30)
		Mobile.tap(editProfile.btnLihatProfil(), 30)
		Mobile.delay(5)
		Mobile.swipe(108, 2067, 108, 849)
		Mobile.tap(editProfile.btnEditProfil(), 30)
	}

	@And("Users edit input full name (.*)")
	def EditFullname(String fullname) {
		Mobile.tap(editProfile.inputFullName(), 30)
		Mobile.setText(editProfile.inputFullName(), fullname, 30)
		Mobile.pressBack()
	}

	@And("Users edit input blank full name (.*)")
	def EditBlankFullname(String fullname) {
		Mobile.tap(editProfile.inputFullName(), 30)
		Mobile.clearText(editProfile.inputFullName(), 30)
		Mobile.pressBack()
	}

	@And("Users edit select gender (.*)")
	def EditGender(String gender) {
		if(gender == 'Laki-laki') {
			Mobile.tap(editProfile.selectGender(), 30)
			Mobile.tap(editProfile.selectGenderMale(), 30)
			Mobile.comment(gender)
		} else if(gender == 'Perempuan') {
			Mobile.tap(editProfile.selectGender(), 30)
			Mobile.tap(editProfile.selectGenderFemale(), 30)
			Mobile.comment(gender)
		} else {
			Mobile.comment("Tidak ada pilihan")
		}
	}

	@And("Users click button simpan")
	def ClickButtonSimpan() {
		Mobile.swipe(108, 2067, 108, 849)
		Mobile.tap(editProfile.btnSimpan(), 30)
	}

	@Then("Users see information alert (.*)")
	def ShowingAlert(String status) {
		if(status == 'Edit berhasil') {
			Mobile.waitForElementPresent(editProfile.PerubahanBerhasil(), 30)
			Mobile.tap(editProfile.btnOKAlert(), 30)
			Mobile.pressBack()
			Mobile.pressBack()
			Mobile.comment(status)
		} else {
			Mobile.swipe(108, 849, 108, 2067)
			Mobile.verifyElementVisible(editProfile.NamaBelumDiisi(), 30)
			Mobile.pressBack()
			Mobile.pressBack()
			Mobile.pressBack()
		}
	}
}