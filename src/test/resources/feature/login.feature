Feature: verifying Adactin details

  Scenario Outline: verifying Adactin login with valid credetials
    Given user is on the Adactin page
    When user should enter "<UserName>" "<Passward>" and click the login button
    And user should search hotel with "<location>""<hotels>""<room type>""<No of room>""<Adults>""<Chick in Date>""<Check out date>""<Children per Room>"
    And user should select the hotel
    And user should select the hotel with "<first_name>""<last_name>""<address>""<credit>""<cardtype>""<Month>""<year>""<Cvv>"

    Examples: 
      | UserName  | Passward   | location | hotels      | room type | No of room | Adults  | Chick in Date | Check out date | Children per Room | first_name | last_name | address | credit           | cardtype | Month | year | Cvv |
      | Lekshitha | Amma@12345 | Sydney   | Hotel Creek | Standard  | 2 - Two    | 1 - One | 19/08/2021    | 21/08/2021     | 1 - One           | Kanchana   | Baskaran  | Chennai | 1234567890123456 | VISA     | June  | 2022 | 978 |
