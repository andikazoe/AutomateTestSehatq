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

public class EditProfileObject extends BasePageObject {

	private TestObject btnImageIconLogin
	private TestObject btnLihatProfil
	private TestObject btnEditProfil
	private TestObject inputFullName
	private TestObject selectGender
	private TestObject selectGenderMale
	private TestObject selectGenderFemale
	private TestObject btnSimpan
	private TestObject PerubahanBerhasil
	private TestObject btnOKAlert
	private TestObject NamaBelumDiisi


	public TestObject btnImageIconLogin(){
		btnImageIconLogin = createTestObjectByXpath("btnImageIconLogin", "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.she.sehatq:id/iv_profile_nav' and (@text = '' or . = '')]")
	}

	public TestObject btnLihatProfil(){
		btnImageIconLogin = createTestObjectByXpath("btnImageIconLogin", "//*[@class = 'android.widget.TextView' and (@text = 'Lihat Profil' or . = 'Lihat Profil') and @resource-id = 'com.she.sehatq:id/tvDetailProfile']")
	}

	public TestObject btnEditProfil(){
		btnEditProfil = createTestObjectByXpath("btnEditProfil", "//*[@class = 'android.widget.Button' and (@text = 'Edit Profil' or . = 'Edit Profil') and @resource-id = 'com.she.sehatq:id/btnEdit']")
	}

	public TestObject inputFullName(){
		inputFullName = createTestObjectByXpath("inputFullName", "//*[@class = 'android.widget.EditText' and @resource-id = 'com.she.sehatq:id/et_input']")
	}

	public TestObject selectGender(){
		selectGender = createTestObjectByXpath("selectGender", "//*[@class = 'android.view.View' and @resource-id = 'com.she.sehatq:id/btnGender' and (@text = '' or . = '')]")
	}

	public TestObject selectGenderMale(){
		selectGenderMale = createTestObjectByXpath("selectGenderMale", "//*[@class = 'android.widget.TextView' and (@text = 'Laki-laki' or . = 'Laki-laki') and @resource-id = 'com.she.sehatq:id/tvMale']")
	}

	public TestObject selectGenderFemale(){
		selectGenderFemale = createTestObjectByXpath("selectGenderFemale", "//*[@class = 'android.widget.TextView' and (@text = 'Perempuan' or . = 'Perempuan') and @resource-id = 'com.she.sehatq:id/tvFemale']")
	}

	public TestObject btnSimpan(){
		btnSimpan = createTestObjectByXpath("btnSimpan", "//*[@class = 'android.widget.Button' and (@text = 'Simpan' or . = 'Simpan') and @resource-id = 'com.she.sehatq:id/btnSave']")
	}

	public TestObject PerubahanBerhasil(){
		PerubahanBerhasil = createTestObjectByXpath("PerubahanBerhasil", "//*[@class = 'android.widget.TextView' and (@text = 'Perubahan Berhasil Disimpan' or . = 'Perubahan Berhasil Disimpan') and @resource-id = 'com.she.sehatq:id/textView']")
	}

	public TestObject btnOKAlert(){
		btnOKAlert = createTestObjectByXpath("btnOKAlert", "//*[@class = 'android.widget.Button' and (@text = 'Ok' or . = 'Ok') and @resource-id = 'com.she.sehatq:id/btnOk']")
	}

	public TestObject NamaBelumDiisi(){
		NamaBelumDiisi = createTestObjectByXpath("NamaBelumDiisi", "//*[@class = 'android.widget.TextView' and (@text = 'Nama belum diisi' or . = 'Nama belum diisi') and @resource-id = 'com.she.sehatq:id/tv_error']")
	}
}
