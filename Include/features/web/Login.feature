@tag
Feature: Scenario Login From Website
  I want to use this template for my feature file

  @tag1
  Scenario Outline: User login dengan kondisi email benar dan password benar
    Given User is on login screen
    When User Do Input email <email>
    And User Do Input password <password>
    And User Do click button login
    Then User Can See Showing alerts <status>

    Examples: 
      | email | password | status |
      | andika.zurahman@gmail.com | andikazoe123= | Login berhasil |
      
      
  @tag2
  Scenario Outline: User login dengan kondisi email benar dan password salah
    Given User is on login screen
    When User Do Input email <email>
    And User Do Input wrong password <password>
    And User Do click button login
    Then User Can See Showing alerts <status>

    Examples: 
      | email | password | status |
      | andika.zurahman@gmail.com | andikatest123 | Email atau Password yang Anda masukkan salah |
      
      
  @tag3
  Scenario Outline: User login dengan kondisi email belum pernah terdaftar
    Given User is on login screen
    When Users Do Input email not yet register <email>
    And User Do Input password <password>
    And User Do click button login
    Then User Can See Showing alerts <status>

    Examples: 
      | email | password | status |
      | andikatest@gmail.com | andikatest123 | Email harus diisi dengan benar |
      
      
 	@tag4
  Scenario Outline: User login dengan kondisi format email salah
    Given User is on login screen
    When User Do Input wrong email format input <email>
    And User Do Input password <password>
    And User Do click button login
    Then User Can See Showing alerts <status>

    Examples: 
      | email | password | status |
      | andikatestgmail.com | andikatest123 | Email harus diisi dengan benar |
      
      
  @tag5
  Scenario Outline: User login dengan kondisi email kosong
    Given User is on login screen
    When User Do Input blank email
    And User Do Input password <password>
    And User Do click button login
    Then User Can See Showing alerts <status>

    Examples: 
      | password | status |
      | andikazoe123= | Alamat Email wajib diisi |
      
      
  @tag6
  Scenario Outline: User login dengan kondisi password kosong
    Given User is on login screen
    When User Do Input email <email>
    And User Do Input blank password
    And User Do click button login
    Then User Can See Showing alerts <status>

    Examples: 
      | email | status |
      | andika.zurahman@gmail.com | Password wajib diisi |
      
      
  @tag7
  Scenario Outline: Login menggunakan dengan kondisi password kurang dari 6 karakter
    Given User is on login screen
    When User Do Input email <email>
    And Users Do Input password less than 6 characters <password>
    And User Do click button login
    Then User Can See Showing alerts <status>

    Examples: 
      | email | password | status |
      | andika.zurahman@gmail.com | and | Kolom Password minimal 6 |
      
      
      
      