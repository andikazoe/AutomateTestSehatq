@tag
Feature: Scenario Login From Mobile Android
  I want to use this template for my feature file

  @tag1
	Scenario Outline: User login dengan kondisi email benar dan password benar di Mobile
    Given Users is on login screen mobile
    When Users Do Input email mobile <email>
    And Users Do Input password mobile <password>
    And Users click button login Mobile
    Then Users Can See Showing alerts mobile <status>

    Examples: 
      | email | password | status |
      | andika.zurahman@gmail.com | andikazoe123= | Login berhasil |
      
      
  @tag2
	Scenario Outline: User login dengan kondisi email benar dan password salah di Mobile
    Given Users is on login screen mobile
    When Users Do Input email mobile <email>
    And Users Input wrong password mobile <password>
    And Users click button login Mobile
    Then Users Can See Showing alerts mobile <status>

    Examples: 
      | email | password | status |
      | andika.zurahman@gmail.com | andikatest123 | Email atau Password salah |
      
      
  @tag3
	Scenario Outline: User login dengan kondisi email belum pernah terdaftar di Mobile
    Given Users is on login screen mobile
    When Users Inputs email mobile not yet register <email>
    And Users Do Input password mobile <password>
    And Users click button login Mobile
    Then Users Can See Showing alerts mobile <status>

    Examples: 
      | email | password | status |
      | andikatest@gmail.com | andikatest123 | Email harus diisi dengan benar |
      
      
  @tag4
	Scenario Outline: User login dengan kondisi format email salah di Mobile
    Given Users is on login screen mobile
    When Users Input wrong email mobile format input <email>
    And Users Do Input password mobile <password>
    And Users click button login Mobile
    Then Users Can See Showing alerts mobile <status>

    Examples: 
      | email | password | status |
      | andikatestgmail.com | andikatest123 | Masukkan Email Dengan Benar |
      
      
  @tag5
	Scenario Outline: User login dengan kondisi email kosong di Mobile
    Given Users is on login screen mobile
    When Users Do Input blank email mobile <email>
    And Users Do Input password mobile <password>
    And Users click button login Mobile
    Then Users Can See Showing alerts mobile <status>

    Examples: 
      | email | password | status |
      | Kosong | andikazoe123= | Email harus diisi dengan benar |
      
      
  @tag6
	Scenario Outline: User login dengan kondisi password kosong
		Given Users is on login screen mobile
    When Users Do Input email mobile <email>
    And Users Do Input blank password mobile <password>
    And Users click button login Mobile
    Then Users Can See Showing alerts mobile <status>

    Examples: 
      | email | password | status |
      | andika.zurahman@gmail.com | Kosong | Password Minimal 6 Karakter |
      
      
  @tag7
	Scenario Outline: Login menggunakan dengan kondisi password kurang dari 6 karakter
    Given Users is on login screen mobile
    When Users Do Input email mobile <email>
    And Users input password mobile less than 6 characters <password>
    And Users click button login Mobile
    Then Users Can See Showing alerts mobile <status>

    Examples: 
      | email | password | status |
      | andika.zurahman@gmail.com | and | Password Minimal 6 Karakter |       
    
      
      