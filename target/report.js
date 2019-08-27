$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/ada.feature");
formatter.feature({
  "name": "Add TariffPlan Validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "Add TariffPlan details with valid data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should be telecom homepage and navigate to Addtariffplan page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should enter plan details and click submit",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should be displayed with congratulation you add Tariffplan",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});