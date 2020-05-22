$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/features/Login.feature");
formatter.feature({
  "name": "Download online catalog",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "download catalog of \"Soft Starters\" from \"Drivers and soft Starters\"",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open the home page of automationdirect.com",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginStepDef.open_the_home_page_of_automationdirect_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the \"Soft Starters\" from \"Drivers and soft Starters\" in \"Online Catalog\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginStepDef.navigate_to_the_from_in(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the download",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginStepDef.verify_the_download()"
});
formatter.result({
  "status": "passed"
});
});