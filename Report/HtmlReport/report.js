$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Signup.feature");
formatter.feature({
  "line": 2,
  "name": "Signup",
  "description": "",
  "id": "signup",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Signup"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User Signup with credentials",
  "description": "",
  "id": "signup;user-signup-with-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"\u003cfirstname\u003e\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter \"\u003clastname\u003e\" last name",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enter \"\u003cEmail\u003e\" Email",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enter \"\u003cPassword\u003e\" Password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user ReEnter \"\u003cpass\u003e\"  password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click the checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click the signup button",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "signup;user-signup-with-credentials;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname"
      ],
      "line": 15,
      "id": "signup;user-signup-with-credentials;;1"
    },
    {
      "cells": [
        "Madhan",
        "Makes"
      ],
      "line": 16,
      "id": "signup;user-signup-with-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "User Signup with credentials",
  "description": "",
  "id": "signup;user-signup-with-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Signup"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"Madhan\" first name",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter \"Makes\" last name",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enter \"\u003cEmail\u003e\" Email",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enter \"\u003cPassword\u003e\" Password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user ReEnter \"\u003cpass\u003e\"  password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click the checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click the signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "Signup.user_Launch_the_browser()"
});
formatter.result({
  "duration": 8792943700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Madhan",
      "offset": 12
    }
  ],
  "location": "Signup.user_enter_first_name(String)"
});
formatter.result({
  "duration": 91494100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Makes",
      "offset": 12
    }
  ],
  "location": "Signup.user_enter_last_name(String)"
});
formatter.result({
  "duration": 73207700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cEmail\u003e",
      "offset": 12
    }
  ],
  "location": "Signup.user_enter_Email(String)"
});
formatter.result({
  "duration": 110425300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cPassword\u003e",
      "offset": 12
    }
  ],
  "location": "Signup.user_enter_Password(String)"
});
formatter.result({
  "duration": 102279200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cpass\u003e",
      "offset": 14
    }
  ],
  "location": "Signup.user_ReEnter_password(String)"
});
formatter.result({
  "duration": 143471000,
  "status": "passed"
});
formatter.match({
  "location": "Signup.user_click_the_checkbox()"
});
formatter.result({
  "duration": 6143128000,
  "status": "passed"
});
formatter.match({
  "location": "Signup.user_click_the_signup_button()"
});
formatter.result({
  "duration": 6208657000,
  "status": "passed"
});
});