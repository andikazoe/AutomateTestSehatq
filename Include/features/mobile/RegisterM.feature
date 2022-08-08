@tag
Feature: Scenario Register From Mobile Android
  I want to use this template for my feature file

  @tag1
  Scenario Outline: User melakukan Register dengan kondisi berhasil
    Given Users is on Register screen
    When Users Input full name <fullname>
    And Users Input email <email>
    And Users Input password <password>
    And Users checkbox Terms and Privacy Policy
    And Users click button daftar
    Then Users Can See Showing information <status>

    Examples: 
      | fullname | email | password | status |
      | Test Andika | andika.zurahman+5@gmail.com | andikazoe123= | Login berhasil |
      
      
  @tag2
  Scenario Outline: User melakukan Register dengan nama lengkap kosong
    Given Users is on Register screen
    When Users Input blank full name <fullname>
    And Users Input email <email>
    And Users Input password <password>
    And Users checkbox Terms and Privacy Policy
    And Users click button daftar
    Then Users Can See Showing information <status>

    Examples: 
      | fullname | email | password | status |
      | Kosong | andika.zurahman+4@gmail.com | andikazoe123= | Nama Lengkap Kosong |
      
      
  @tag3
  Scenario Outline: User melakukan Register dengan email kosong
    Given Users is on Register screen
    When Users Input full name <fullname>
    And Users Input blank email <email>
    And Users Input password <password>
    And Users checkbox Terms and Privacy Policy
    And Users click button daftar
    Then Users Can See Showing information <status>

    Examples: 
      | fullname | email | password | status |
      | Test Andika | Kosong | andikazoe123= | Email Kosong |
      
      
  @tag4
  Scenario Outline: User melakukan Register dengan password kosong
    Given Users is on Register screen
    When Users Input full name <fullname>
    And Users Input email <email>
    And Users Input blank password <password>
    And Users checkbox Terms and Privacy Policy
    And Users click button daftar
    Then Users Can See Showing information <status>

    Examples: 
      | fullname | email | password | status |
      | Test Andika | andika.zurahman+4@gmail.com | Kosong | Password Kosong |
      
      
  @tag5
  Scenario Outline: User melakukan Register dengan password kurang dari 6 karakter
    Given Users is on Register screen
    When Users Input full name <fullname>
    And Users Input email <email>
    And Users Input Password less more than 6 <password>
    And Users checkbox Terms and Privacy Policy
    And Users click button daftar
    Then Users Can See Showing information <status>

    Examples: 
      | fullname | email | password | status |
      | Test Andika | andika.zurahman+4@gmail.com | and | Password Minimal 6 Karakter |
      
       
  @tag6
  Scenario Outline: User melakukan Register dengan email yang sudah pernah di daftarkan
    Given Users is on Register screen
    When Users Input full name <fullname>
    And Users Input Email already registered <email>
    And Users Input password <password>
    And Users checkbox Terms and Privacy Policy
    And Users click button daftar
    Then Users Can See Showing information <status>

    Examples: 
      | fullname | email | password | status |
      | Test Andika | andika.zurahman@gmail.com | andikazoe123= | Email already registered |
      
      
      
      