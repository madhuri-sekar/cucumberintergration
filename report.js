$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fold/folder2.feature");
formatter.feature({
  "name": "Test search functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "search for laptops",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open testmeapplication",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.open_testmeapp()"
});
formatter.result({
  "error_message": "java.lang.Error: Unresolved compilation problem: \n\tChromeDriverS cannot be resolved to a type\n\r\n\tat cucu.Search.open_testmeapp(Search.java:22)\r\n\tat ✽.open testmeapplication(fold/folder2.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter \"Hand bag\"",
  "keyword": "When "
});
formatter.match({
  "location": "Search.user_enters(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click enter",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_clicks_enter()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "check url",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "search for travelkit",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open testmeapplication",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.open_testmeapp()"
});
formatter.result({
  "error_message": "java.lang.Error: Unresolved compilation problem: \n\tChromeDriverS cannot be resolved to a type\n\r\n\tat cucu.Search.open_testmeapp(Search.java:22)\r\n\tat ✽.open testmeapplication(fold/folder2.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter \"Handy carry\"",
  "keyword": "When "
});
formatter.match({
  "location": "Search.user_enters(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click enter",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_clicks_enter()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "check url",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});