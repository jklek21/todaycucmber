$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/91908/eclipse-workspace/cucumber/src/test/resources/feature/login.feature");
formatter.feature({
  "name": "verifying Adactin details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verifying Adactin login with valid credetials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the Adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter \"\u003cUserName\u003e\" \"\u003cPassward\u003e\" and click the login button",
  "keyword": "When "
});
formatter.step({
  "name": "user should search hotel with \"\u003clocation\u003e\"\"\u003chotels\u003e\"\"\u003croom type\u003e\"\"\u003cNo of room\u003e\"\"\u003cAdults\u003e\"\"\u003cChick in Date\u003e\"\"\u003cCheck out date\u003e\"\"\u003cChildren per Room\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should select the hotel",
  "keyword": "And "
});
formatter.step({
  "name": "user should select the hotel with \"\u003cfirst_name\u003e\"\"\u003clast_name\u003e\"\"\u003caddress\u003e\"\"\u003ccredit\u003e\"\"\u003ccardtype\u003e\"\"\u003cMonth\u003e\"\"\u003cyear\u003e\"\"\u003cCvv\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Passward",
        "location",
        "hotels",
        "room type",
        "No of room",
        "Adults",
        "Chick in Date",
        "Check out date",
        "Children per Room",
        "first_name",
        "last_name",
        "address",
        "credit",
        "cardtype",
        "Month",
        "year",
        "Cvv"
      ]
    },
    {
      "cells": [
        "Lekshitha",
        "Amma@12345",
        "Sydney",
        "Hotel Creek",
        "Standard",
        "2 - Two",
        "1 - One",
        "19/08/2021",
        "21/08/2021",
        "1 - One",
        "Kanchana",
        "Baskaran",
        "Chennai",
        "1234567890123456",
        "VISA",
        "June",
        "2022",
        "978"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying Adactin login with valid credetials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the Adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefClass.a()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"Lekshitha\" \"Amma@12345\" and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefClass.user_should_enter_and_click_the_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should search hotel with \"Sydney\"\"Hotel Creek\"\"Standard\"\"2 - Two\"\"1 - One\"\"19/08/2021\"\"21/08/2021\"\"1 - One\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefClass.user_should_search_hotel_with(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the hotel",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefClass.user_should_select_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the hotel with \"Kanchana\"\"Baskaran\"\"Chennai\"\"1234567890123456\"\"VISA\"\"June\"\"2022\"\"978\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefClass.user_should_select_the_hotel_with(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});