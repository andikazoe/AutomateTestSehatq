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

public class LoginMObject extends BasePageObject {

	private TestObject btnImageIconLogin
	private TestObject inputEmail
	private TestObject inputPassword
	private TestObject btnLogin
	private TestObject btnHamburgerMenu
	private TestObject btnPengaturanAplikasi
	private TestObject btnLogOut
	private TestObject btnLogOutYa
	private TestObject EmailAtauPasswordSalah
	private TestObject btnOkMessageAlert
	private TestObject EmailHarusDenganBenar
	private TestObject PasswordMinimalEnamKarakter
	private TestObject MasukkanEmailDenganBenar

	public TestObject btnImageIconLogin(){
		btnImageIconLogin = createTestObjectByXpath("btnImageIconLogin", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/iv_profile_nav' and (@text = '' or . = '')]")
	}

	public TestObject inputEmail(){
		inputEmail = createTestObjectByXpath("inputEmail", "//*[@class = 'android.widget.EditText' and (@text = 'Email' or . = 'Email') and @resource-id = 'com.she.sehatq:id/et_input']")
	}

	public TestObject inputPassword(){
		inputPassword = createTestObjectByXpath("inputPassword", "//*[@class = 'android.widget.EditText' and (@text = 'Password' or . = 'Password') and @resource-id = 'com.she.sehatq:id/et_input']")
	}

	public TestObject btnLogin(){
		btnLogin = createTestObjectByXpath("btnLogin", "//*[@class = 'android.widget.Button' and (@text = 'Log in' or . = 'Log in') and @resource-id = 'com.she.sehatq:id/btn_login']")
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

	public TestObject EmailAtauPasswordSalah(){
		EmailAtauPasswordSalah = createTestObjectByXpath("EmailAtauPasswordSalah", "//*[@class = 'android.widget.TextView' and (@text = 'Email atau Password yang Anda masukkan salah. ' or . = 'Email atau Password yang Anda masukkan salah. ') and @resource-id = 'com.she.sehatq:id/tv_detail']")
	}

	public TestObject btnOkMessageAlert(){
		btnOkMessageAlert = createTestObjectByXpath("btnOkMessageAlert", "//*[@class = 'android.widget.Button' and (@text = 'OK' or . = 'OK') and @resource-id = 'com.she.sehatq:id/btn_ok']")
	}

	public TestObject EmailHarusDenganBenar(){
		EmailHarusDenganBenar = createTestObjectByXpath("EmailHarusDenganBenar", "//*[@class = 'android.widget.TextView' and (@text = 'Email harus diisi dengan benar. ' or . = 'Email harus diisi dengan benar. ') and @resource-id = 'com.she.sehatq:id/tv_detail']")
	}

	public TestObject PasswordMinimalEnamKarakter(){
		PasswordMinimalEnamKarakter = createTestObjectByXpath("PasswordMinimalEnamKarakter", "//*[@class = 'android.widget.TextView' and (@text = 'Password minimal 6 karakter' or . = 'Password minimal 6 karakter') and @resource-id = 'com.she.sehatq:id/tv_error']")
	}

	public TestObject MasukkanEmailDenganBenar(){
		MasukkanEmailDenganBenar = createTestObjectByXpath("MasukkanEmailDenganBenar", "//*[@class = 'android.widget.TextView' and (@text = 'Masukkan email yang valid' or . = 'Masukkan email yang valid') and @resource-id = 'com.she.sehatq:id/tv_error']")
	}
}
