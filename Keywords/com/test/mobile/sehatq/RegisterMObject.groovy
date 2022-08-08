package com.test.mobile.sehatq

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

public class RegisterMObject extends BasePageObject {

	private TestObject btnImageIconLogin
	private TestObject btnDaftarLogin
	private TestObject inputNamaLengkap
	private TestObject inputEmail
	private TestObject inputPassword
	private TestObject btnCheckbox
	private TestObject btnDaftarRegister
	private TestObject btnLewati
	private TestObject btnLewatiYA
	private TestObject btnHamburgerMenu
	private TestObject btnPengaturanAplikasi
	private TestObject btnLogOut
	private TestObject btnLogOutYa
	private TestObject EmailSudahAda
	private TestObject btnOkMessageAlert
	private TestObject NameMustBeFilled
	private TestObject MasukkanEmailValid
	private TestObject PasswordMustBeFilled
	private TestObject PasswordMinimalEnamKarakter

	public TestObject btnImageIconLogin(){
		btnImageIconLogin = createTestObjectByXpath("btnImageIconLogin", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/iv_profile_nav' and (@text = '' or . = '')]")
	}

	public TestObject btnDaftarLogin(){
		btnDaftarLogin = createTestObjectByXpath("btnDaftarLogin", "//*[@class = 'android.widget.TextView' and (@text = 'Daftar' or . = 'Daftar') and @resource-id = 'com.she.sehatq:id/tv_signup']")
	}

	public TestObject inputNamaLengkap(){
		inputNamaLengkap = createTestObjectByXpath("inputNamaLengkap", "//*[@class = 'android.widget.EditText' and (@text = 'Nama Lengkap' or . = 'Nama Lengkap') and @resource-id = 'com.she.sehatq:id/et_input']")
	}

	public TestObject inputEmail(){
		inputEmail = createTestObjectByXpath("inputEmail", "//*[@class = 'android.widget.EditText' and (@text = 'Email' or . = 'Email') and @resource-id = 'com.she.sehatq:id/et_input']")
	}

	public TestObject inputPassword(){
		inputPassword = createTestObjectByXpath("inputPassword", "//*[@class = 'android.widget.EditText' and (@text = 'Password' or . = 'Password') and @resource-id = 'com.she.sehatq:id/et_input']")
	}

	public TestObject btnCheckbox(){
		btnCheckbox = createTestObjectByXpath("btnCheckbox", "//*[@class = 'android.widget.CheckBox' and @resource-id = 'com.she.sehatq:id/cb_terms' and (@text = '' or . = '')]")
	}

	public TestObject btnDaftarRegister(){
		btnDaftarRegister = createTestObjectByXpath("btnDaftarRegister", "//*[@class = 'android.widget.Button' and (@text = 'Daftar' or . = 'Daftar') and @resource-id = 'com.she.sehatq:id/btn_signup']")
	}

	public TestObject btnLewati(){
		btnLewati = createTestObjectByXpath("btnLewati", "//*[@class = 'android.widget.TextView' and (@text = 'Lewati' or . = 'Lewati') and @resource-id = 'com.she.sehatq:id/tvSkip']")
	}

	public TestObject btnLewatiYA(){
		btnLewatiYA = createTestObjectByXpath("btnLewatiYA", "//*[@class = 'android.widget.TextView' and (@text = 'Ya' or . = 'Ya') and @resource-id = 'com.she.sehatq:id/btn_yes']")
	}

	public TestObject btnHamburgerMenu(){
		btnHamburgerMenu = createTestObjectByXpath("btnHamburgerMenu", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/ivMore' and (@text = '' or . = '')]")
	}

	public TestObject btnPengaturanAplikasi(){
		btnPengaturanAplikasi = createTestObjectByXpath("btnPengaturanAplikasi", "//*[@class = 'android.widget.TextView' and (@text = 'Pengaturan Aplikasi' or . = 'Pengaturan Aplikasi') and @resource-id = 'com.she.sehatq:id/tvTitle']")
	}

	public TestObject btnLogOut(){
		btnLogOut = createTestObjectByXpath("btnLogOut", "//*[@class = 'android.widget.TextView' and (@text = 'Log Out' or . = 'Log Out') and @resource-id = 'com.she.sehatq:id/tv_sign_out']")
	}

	public TestObject btnLogOutYa(){
		btnLogOutYa = createTestObjectByXpath("btnLogOutYa", "//*[@class = 'android.widget.TextView' and (@text = 'Ya' or . = 'Ya') and @resource-id = 'com.she.sehatq:id/btn_yes']")
	}

	public TestObject EmailSudahAda(){
		EmailSudahAda = createTestObjectByXpath("EmailSudahAda", "//*[@class = 'android.widget.TextView' and (@text = 'Email sudah ada, mohon gunakan email lain. ' or . = 'Email sudah ada, mohon gunakan email lain. ') and @resource-id = 'com.she.sehatq:id/tv_detail']")
	}

	public TestObject btnOkMessageAlert(){
		btnOkMessageAlert = createTestObjectByXpath("btnOkMessageAlert", "//*[@class = 'android.widget.Button' and (@text = 'OK' or . = 'OK') and @resource-id = 'com.she.sehatq:id/btn_ok']")
	}

	public TestObject NameMustBeFilled(){
		NameMustBeFilled = createTestObjectByXpath("NameMustBeFilled", "//*[@class = 'android.widget.TextView' and (@text = 'Name must be filled in correctly' or . = 'Name must be filled in correctly') and @resource-id = 'com.she.sehatq:id/tv_error']")
	}

	public TestObject MasukkanEmailValid(){
		MasukkanEmailValid = createTestObjectByXpath("MasukkanEmailValid", "//*[@class = 'android.widget.TextView' and (@text = 'Masukkan email yang valid' or . = 'Masukkan email yang valid') and @resource-id = 'com.she.sehatq:id/tv_error']")
	}

	public TestObject PasswordMustBeFilled(){
		PasswordMustBeFilled = createTestObjectByXpath("PasswordMustBeFilled", "//*[@class = 'android.widget.TextView' and (@text = 'Password must be filled in correctly' or . = 'Password must be filled in correctly') and @resource-id = 'com.she.sehatq:id/tv_error']")
	}

	public TestObject PasswordMinimalEnamKarakter(){
		PasswordMinimalEnamKarakter = createTestObjectByXpath("PasswordMinimalEnamKarakter", "//*[@class = 'android.widget.TextView' and (@text = 'Password minimal 6 karakter' or . = 'Password minimal 6 karakter') and @resource-id = 'com.she.sehatq:id/tv_error']")
	}
}
