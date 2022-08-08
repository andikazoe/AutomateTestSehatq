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

public class EditProfileObject extends BasePageObject {

	private TestObject btnProfil
	private TestObject btnEditProfil
	private TestObject inputFullname
	private TestObject btnLogin
	private TestObject selectGender
	private TestObject selectListGender
	private TestObject inputHeight
	private TestObject inputWeight
	private TestObject inputAddress
	private TestObject btnSimpan
	private TestObject TextInformation
	private TestObject NamaLengkapWajibDiisi
	private TestObject TinggiBadanWajibDiisi
	private TestObject BeratBadanWajibDiisi
	private TestObject HeaderEditProfilKamu

	public TestObject btnProfil(){
		btnProfil = createTestObjectByXpath("btnProfil", "//*/text()[normalize-space(.)='Profil']/parent::*")
	}

	public TestObject btnEditProfil(){
		btnEditProfil = createTestObjectByXpath("btnEditProfil", "//*/text()[normalize-space(.)='Edit Profil']/parent::*")
	}

	public TestObject inputFullname(){
		inputFullname = createTestObjectByXpath("inputFullname", "//input[@name='name']")
	}

	public TestObject selectGender(){
		selectGender = createTestObjectByXpath("selectGender", "//div[@id='gender']/div/button")
	}

	public TestObject selectListGender(String gender){
		selectListGender = createTestObjectByXpath("selectListGender", "//a[contains(text(),'${gender}')]")
	}

	public TestObject inputHeight(){
		inputHeight = createTestObjectByXpath("inputHeight", "//input[@name='height']")
	}

	public TestObject inputWeight(){
		inputWeight = createTestObjectByXpath("inputWeight", "//input[@name='weight']")
	}

	public TestObject inputAddress(){
		inputAddress = createTestObjectByXpath("inputAddress", "//textarea[@id='address']")
	}

	public TestObject btnSimpan(){
		btnSimpan = createTestObjectByXpath("btnSimpan", "//*/text()[normalize-space(.)='Simpan']/parent::*")
	}

	public TestObject TextInformation(String status){
		TextInformation = createTestObjectByXpath("TextInformation", "//*/text()[normalize-space(.)='${status}']/parent::*")
	}

	public TestObject NamaLengkapWajibDiisi(){
		NamaLengkapWajibDiisi = createTestObjectByXpath("NamaLengkapWajibDiisi", "//*/text()[normalize-space(.)='Nama Lengkap wajib diisi']/parent::*")
	}

	public TestObject TinggiBadanWajibDiisi(){
		TinggiBadanWajibDiisi = createTestObjectByXpath("TinggiBadanWajibDiisi", "//*/text()[normalize-space(.)='Tinggi Badan wajib diisi']/parent::*")
	}

	public TestObject BeratBadanWajibDiisi(){
		BeratBadanWajibDiisi = createTestObjectByXpath("BeratBadanWajibDiisi", "//*/text()[normalize-space(.)='Berat Badan wajib diisi']/parent::*")
	}

	public TestObject HeaderEditProfilKamu(){
		HeaderEditProfilKamu = createTestObjectByXpath("HeaderEditProfilKamu", "//*/text()[normalize-space(.)='Edit Profil Kamu']/parent::*")
	}
}
