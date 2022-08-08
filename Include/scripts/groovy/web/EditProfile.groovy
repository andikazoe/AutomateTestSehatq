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
import com.test.web.sehatq.EditProfileObject
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



class EditProfile {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	LoginObject login = new LoginObject()
	EditProfileObject editprofile = new EditProfileObject()

	@Given("User is on Profile Page")
	def UserOnProfilePage() {
		WebUI.openBrowser(GlobalVariable.LINK_LOGIN)
		WebUI.maximizeWindow()
		WebUI.doubleClick(login.inputEmail())
		WebUI.setText(login.inputEmail(), GlobalVariable.Email)
		WebUI.doubleClick(login.inputPassword())
		WebUI.setText(login.inputPassword(), GlobalVariable.Password)
		WebUI.click(login.btnLogin())
		WebUI.click(login.iconProfile())
		WebUI.click(editprofile.btnProfil())
	}

	@When("User click button edit profil")
	def ClickEditProfil() {
		WebUI.click(editprofile.btnEditProfil())
	}

	@And("User edit input full name (.*)")
	def InputFullname(String fullname) {
		WebUI.waitForElementVisible(editprofile.inputFullname(), 30)
		WebUI.click(editprofile.inputFullname())
		WebUI.sendKeys(editprofile.inputFullname(), Keys.chord(Keys.CONTROL,'a'))
		WebUI.sendKeys(editprofile.inputFullname(), Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(editprofile.inputFullname(), fullname)
	}

	@And("User edit input height (.*)")
	def InputHeigth(String height) {
		WebUI.waitForElementVisible(editprofile.inputFullname(), 30)
		WebUI.click(editprofile.inputHeight())
		WebUI.sendKeys(editprofile.inputHeight(), Keys.chord(Keys.CONTROL,'a'))
		WebUI.sendKeys(editprofile.inputHeight(), Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(editprofile.inputHeight(), height)
	}

	@And("User edit input weight (.*)")
	def InputWeight(String weight) {
		WebUI.waitForElementVisible(editprofile.inputFullname(), 30)
		WebUI.click(editprofile.inputWeight())
		WebUI.sendKeys(editprofile.inputWeight(), Keys.chord(Keys.CONTROL,'a'))
		WebUI.sendKeys(editprofile.inputWeight(), Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(editprofile.inputWeight(), weight)
	}

	@And("User edit input address (.*)")
	def InputAddress(String address) {
		WebUI.waitForElementVisible(editprofile.inputFullname(), 30)
		WebUI.click(editprofile.inputAddress())
		WebUI.sendKeys(editprofile.inputAddress(), Keys.chord(Keys.CONTROL,'a'))
		WebUI.sendKeys(editprofile.inputAddress(), Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(editprofile.inputAddress(), address)
	}

	@And("User edit select gender (.*)")
	def SelectGender(String gender) {
		WebUI.waitForElementVisible(editprofile.inputFullname(), 30)
		WebUI.click(editprofile.selectGender())
		WebUI.click(editprofile.selectListGender(gender))
	}

	@And("User edit input blank full name")
	def InputBlankFullname() {
		WebUI.waitForElementVisible(editprofile.inputFullname(), 30)
		WebUI.click(editprofile.inputFullname())
		WebUI.sendKeys(editprofile.inputFullname(), Keys.chord(Keys.CONTROL,'a'))
		WebUI.sendKeys(editprofile.inputFullname(), Keys.chord(Keys.BACK_SPACE))
		WebUI.comment("Fullname Kosong")
	}

	@And("User input blank height")
	def InputBlankHeight() {
		WebUI.waitForElementVisible(editprofile.inputHeight(), 30)
		WebUI.click(editprofile.inputHeight())
		WebUI.sendKeys(editprofile.inputHeight(), Keys.chord(Keys.CONTROL,'a'))
		WebUI.sendKeys(editprofile.inputHeight(), Keys.chord(Keys.BACK_SPACE))
		WebUI.comment("Height Kosong")
	}

	@And("User input blank weight")
	def InputBlankWeight() {
		WebUI.waitForElementVisible(editprofile.inputWeight(), 30)
		WebUI.click(editprofile.inputWeight())
		WebUI.sendKeys(editprofile.inputWeight(), Keys.chord(Keys.CONTROL,'a'))
		WebUI.sendKeys(editprofile.inputWeight(), Keys.chord(Keys.BACK_SPACE))
		WebUI.comment("Weight Kosong")
	}

	@And("User click button simpan")
	def ClickButtonSimpan() {
		WebUI.click(editprofile.btnSimpan())
	}

	@Then("User Can See Showing information alert (.*)")
	def ShowingAlerts(String status) {
		if(status == 'Edit berhasil') {
			WebUI.waitForElementVisible(editprofile.btnEditProfil(), 30)
			WebUI.comment(status)
		} else {
			WebUI.scrollToElement(editprofile.HeaderEditProfilKamu(), 30)
			WebUI.verifyMatch((WebUI.getText(editprofile.TextInformation(status)).toString()),status,false, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.comment(status)
		}
	}
}