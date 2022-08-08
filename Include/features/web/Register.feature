@tag
Feature: Scenario Register From Website
  I want to use this template for my feature file

  @tag1
  Scenario Outline: User melakukan Register dengan kondisi berhasil
    Given User is on Register screen
    When User Input full name <fullname>
    And User Input email <email>
    And User Input password <password>
    And User checkbox Terms and Privacy Policy
    And User click button daftar
    Then User Can See Showing alert <status>

    Examples: 
      | fullname | email | password | status  | 
      | Test Andika QA | andika.zurahman+11@gmail.com | andika123= | Login berhasil |
      
        
  @tag2
  Scenario Outline: User melakukan Register dengan nama lengkap kosong
    Given User is on Register screen
    When User Input blank full name
    And User Input email <email>
    And User Input password <password>
    And User checkbox Terms and Privacy Policy
    And User click button daftar
    Then User Can See Showing alert <status>

    Examples: 
      | email | password  | status  | 
      | andika.zurahman+7@gmail.com | andika123= | Nama Lengkap wajib diisi |
      
      
  @tag3
  Scenario Outline: User melakukan Register dengan email kosong
    Given User is on Register screen
    When User Input full name <fullname>
    And User Input blank email
    And User Input password <password>
    And User checkbox Terms and Privacy Policy
    And User click button daftar
    Then User Can See Showing alert <status>

    Examples: 
      | fullname | password  | status  | 
      | Test Andika QA | andika123= | Email wajib diisi |
      
  @tag4
  Scenario Outline: User melakukan Register dengan email tidak sesuai format
    Given User is on Register screen
    When User Input full name <fullname>
    And User input Email does not match <email>
    And User Input password <password>
    And User checkbox Terms and Privacy Policy
    And User click button daftar
    Then User Can See Showing alert <status>

    Examples: 
      | fullname | email | password  | status  | 
      | Test Andika QA | andikagmail.com | andika123= | Email harus diisi dengan benar. |
      
  @tag5
  Scenario Outline: User melakukan Register dengan password kosong
    Given User is on Register screen
    When User Input full name <fullname>
    And User Input email <email>
    And User Input blank password
    And User checkbox Terms and Privacy Policy
    And User click button daftar
    Then User Can See Showing alert <status>

    Examples: 
      | fullname | email | status  | 
      | Test Andika QA | andika.zurahman+7@gmail.com | Password wajib diisi |
      
  @tag6
  Scenario Outline: User melakukan Register dengan password kurang dari 6 karakter
    Given User is on Register screen
    When User Input full name <fullname>
    And User Input email <email>
    And User input password less more than 6 <password>
    And User checkbox Terms and Privacy Policy
    And User click button daftar
    Then User Can See Showing alert <status>

    Examples: 
      | fullname | email | password  | status  | 
      | Test Andika QA | andika.zurahman+7@gmail.com | and | Password harus diisi minimal 6 |
      
  @tag7
  Scenario Outline: User melakukan Register dengan email yang sudah pernah di daftarkan
    Given User is on Register screen
    When User Input full name <fullname>
    And User input email already registered <email>
    And User Input password <password>
    And User checkbox Terms and Privacy Policy
    And User click button daftar
    Then User Can See Showing alert <status>

    Examples: 
      | fullname | email | password  | status  | 
      | Test Andika QA | andika.zurahman@gmail.com | andika123= | Email sudah ada, mohon gunakan email lain |
      
      