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

public class RegisterObject extends BasePageObject {
	
	private TestObject inputFullname
	private TestObject inputEmail
	private TestObject inputPassword
	private TestObject checkboxTermsPolicy
	private TestObject btnDaftar
	private TestObject alertRegisterLoginBerhasil
	private TestObject alertEmailSudahAda
	private TestObject btnImageIconLogin
	private TestObject btnSignOut
	private TestObject alertNamaLengkapWajibDiisi
	private TestObject alertEmailWajibDiisi
	private TestObject alertPasswordWajibDiisi
	private TestObject alertEmailHarusDiisiDenganBenar
	private TestObject alertPasswordHarusMinimalEnam
	private TestObject TextInformation
	
	
	public TestObject inputFullname(){
		inputFullname = createTestObjectByID("inputFullname", "name")
	}
	
	public TestObject inputEmail(){
		inputEmail = createTestObjectByID("inputEmail", "email")
	}
	
	public TestObject inputPassword(){
		inputPassword = createTestObjectByXpath("inputPassword", "//input[@name='password']")
	}
	
	public TestObject checkboxTermsPolicy(){
		checkboxTermsPolicy = createTestObjectByXpath("checkboxTermsPolicy", "//*/text()[normalize-space(.)='Saya menyetujui']/parent::*")
	}
	
	public TestObject btnDaftar(){
		btnDaftar = createTestObjectByXpath("btnDaftar", "//button[@type='submit']")
	}
	
	public TestObject alertRegisterLoginBerhasil(){
		alertRegisterLoginBerhasil = createTestObjectByXpath("alertRegisterLoginBerhasil", "//*/text()[normalize-space(.)='Login Berhasil']/parent::*")
	}
	
	public TestObject alertEmailSudahAda(){
		alertEmailSudahAda = createTestObjectByXpath("alertEmailSudahAda", "//*/text()[normalize-space(.)='Email sudah ada, mohon gunakan email lain']/parent::*")
	}
	
	public TestObject btnImageIconLogin(){
		btnImageIconLogin = createTestObjectByID("btnImageIconLogin", "popover-profile")
	}
	
	public TestObject btnSignOut(){
		btnSignOut = createTestObjectByXpath("btnSignOut", "//*/text()[normalize-space(.)='Sign Out']/parent::*")
	}
	
	public TestObject TextInformation(String status){
		TextInformation = createTestObjectByXpath("TextInformation", "//*/text()[normalize-space(.)='${status}']/parent::*")
	}
	
	public TestObject alertNamaLengkapWajibDiisi(){
		alertNamaLengkapWajibDiisi = createTestObjectByXpath("alertNamaLengkapWajibDiisi", "//*/text()[normalize-space(.)='Nama Lengkap wajib diisi']/parent::*")
	}
	
	public TestObject alertEmailWajibDiisi(){
		alertEmailWajibDiisi = createTestObjectByXpath("alertEmailWajibDiisi", "//*/text()[normalize-space(.)='Email wajib diisi']/parent::*")
	}
	
	public TestObject alertPasswordWajibDiisi(){
		alertPasswordWajibDiisi = createTestObjectByXpath("alertPasswordWajibDiisi", "//*/text()[normalize-space(.)='Password wajib diisi']/parent::*")
	}
	
	public TestObject alertEmailHarusDiisiDenganBenar(){
		alertEmailHarusDiisiDenganBenar = createTestObjectByXpath("alertEmailHarusDiisiDenganBenar", "//*/text()[normalize-space(.)='Email harus diisi dengan benar.']/parent::*")
	}
	
	public TestObject alertPasswordHarusMinimalEnam(){
		alertPasswordHarusMinimalEnam = createTestObjectByXpath("alertPasswordHarusMinimalEnam", "//*/text()[normalize-space(.)='Password harus diisi minimal 6']/parent::*")
	}
	
}
