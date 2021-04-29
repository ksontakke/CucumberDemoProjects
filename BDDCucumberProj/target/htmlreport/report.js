$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "login-test;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should view Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginTest.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 10140529300,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.user_enters_username_and_password()"
});
formatter.result({
  "duration": 8532369600,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.user_should_view_Logout_button()"
});
formatter.result({
  "duration": 2052605400,
  "status": "passed"
});
});