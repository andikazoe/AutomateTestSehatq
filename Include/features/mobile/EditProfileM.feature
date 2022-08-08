@tag
Feature: Scenario Edit Profile From Mobile Android
  I want to use this template for my feature file

  @tag1
  Scenario Outline: User melakukan Edit Profile dengan kondisi berhasil
    Given Users is on Profile Page
    When Users click button edit profil
    And Users edit input full name <fullname>
    And Users click button simpan
    Then Users see information alert <status>

    Examples: 
      | fullname  | status  |
      | andika edit lagi | Edit berhasil |
      
      
  @tag2
  Scenario Outline: User melakukan Edit Profile dengan kondisi ubah gender
    Given Users is on Profile Page
    When Users click button edit profil
    And Users edit select gender <gender>
    And Users click button simpan
    Then Users see information alert <status>

    Examples: 
      | gender  | status  |
      | Laki-laki | Edit berhasil |
      
      
      
  @tag3
  Scenario Outline: User melakukan Edit Profile dengan kondisi nama lengkap kosong
    Given Users is on Profile Page
    When Users click button edit profil
    And Users edit input blank full name <fullname>
    And Users click button simpan
    Then Users see information alert <status>

    Examples: 
      | fullname  | status  |
      | kosong | Blank Fullname |
      
      
      