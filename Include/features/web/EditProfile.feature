@tag
Feature: Scenario Edit Profile From Website
  I want to use this template for my feature file

  @tag1
  Scenario Outline: User melakukan Edit Profile dengan kondisi berhasil
    Given User is on Profile Page
    When User click button edit profil
    And User edit input full name <fullname>
    And User edit input height <height>
    And User edit input weight <weight>
    And User edit input address <address>
    And User click button simpan
    Then User Can See Showing information alert <status>

    Examples: 
      | fullname  | height | weight  | address | status  |
      | andika edit lagi | 175 | 79 | Jl. Delima No. 4 | Edit berhasil  |
      
      
  @tag2
  Scenario Outline: User melakukan Edit Profile dengan kondisi edit gender
    Given User is on Profile Page
    When User click button edit profil
    And User edit select gender <gender>
    And User click button simpan
    Then User Can See Showing information alert <status>

    Examples: 
      | gender | status  |
      | Laki-laki | Edit berhasil |   
      
      
  @tag3
  Scenario Outline: User melakukan Edit Profile dengan kondisi nama lengkap kosong
    Given User is on Profile Page
    When User click button edit profil
    And User edit input blank full name
    And User click button simpan
    Then User Can See Showing information alert <status>

    Examples: 
      | status  |
      | Nama Lengkap wajib diisi | 
      
      
  @tag4
  Scenario Outline: User melakukan Edit Profile dengan kondisi height kosong
    Given User is on Profile Page
    When User click button edit profil
    And User input blank height
    And User click button simpan
    Then User Can See Showing information alert <status>

    Examples: 
      | status  |
      | Tinggi Badan wajib diisi | 
      
      
      
  @tag5
  Scenario Outline: User melakukan Edit Profile dengan kondisi weight kosong
    Given User is on Profile Page
    When User click button edit profil
    And User input blank weight
    And User click button simpan
    Then User Can See Showing information alert <status>

    Examples: 
      | status  |
      | Berat Badan wajib diisi |  
      
      
      