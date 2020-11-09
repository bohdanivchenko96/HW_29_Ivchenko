$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/agileProject.feature");
formatter.feature({
  "name": "Agile project sign in",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AgileProject"
    }
  ]
});
formatter.scenario({
  "name": "Login as a authenticated user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AgileProject"
    }
  ]
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AgileProjectSteps.userIsOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to agile page",
  "keyword": "When "
});
formatter.match({
  "location": "AgileProjectSteps.userNavigatesToAgilePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username \"1303\" and password \"Guru99\"",
  "keyword": "And "
});
formatter.match({
  "location": "AgileProjectSteps.userEntersUsernameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "AgileProjectSteps.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "welcome message is correct",
  "keyword": "Then "
});
formatter.match({
  "location": "AgileProjectSteps.welcomeMessageIsCorrect()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Unhappy login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AgileProject"
    }
  ]
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AgileProjectSteps.userIsOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to agile page",
  "keyword": "When "
});
formatter.match({
  "location": "AgileProjectSteps.userNavigatesToAgilePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username \"111\" and password \"xyz\"",
  "keyword": "And "
});
formatter.match({
  "location": "AgileProjectSteps.userEntersUsernameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "AgileProjectSteps.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "unvalid credentials message is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "AgileProjectSteps.unvalidCredentialsMessageIsShown()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/dragAndDrop.feature");
formatter.feature({
  "name": "Drag and drop is working",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DragAndDrop"
    }
  ]
});
formatter.scenario({
  "name": "Put bank details into drag and drop form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DragAndDrop"
    }
  ]
});
formatter.step({
  "name": "user is on dragAndDrop page",
  "keyword": "Given "
});
formatter.match({
  "location": "DragAndDropSteps.userIsOnDragAndDropPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "success message is not shown",
  "keyword": "And "
});
formatter.match({
  "location": "DragAndDropSteps.successMessageIsNotShown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user drop debit account \"BANK\"",
  "keyword": "When "
});
formatter.match({
  "location": "DragAndDropSteps.userDropDebitAccount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user drop debit amount \"5000\"",
  "keyword": "And "
});
formatter.match({
  "location": "DragAndDropSteps.userDropDebitAmount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user drop credit account \"SALES\"",
  "keyword": "And "
});
formatter.match({
  "location": "DragAndDropSteps.userDropCreditAccount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user drop credit amount \"5000\"",
  "keyword": "And "
});
formatter.match({
  "location": "DragAndDropSteps.userDropCreditAmount(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "success message is shown drag",
  "keyword": "Then "
});
formatter.match({
  "location": "DragAndDropSteps.successMessageIsShownDrag()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/fileUpload.feature");
formatter.feature({
  "name": "File upload is working",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "User can upload file on uploadFilePage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user is on uploadFilePage",
  "keyword": "Given "
});
formatter.match({
  "location": "FileUploadSteps.userIsOnUploadFilePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of page is \"File Upload Demo\"",
  "keyword": "And "
});
formatter.match({
  "location": "FileUploadSteps.titleOfPageIs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click \"Choose File\" button",
  "keyword": "When "
});
formatter.match({
  "location": "FileUploadSteps.userClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add file path",
  "keyword": "And "
});
formatter.match({
  "location": "AgileProjectSteps.addFilePath()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click \"Submit File\" button",
  "keyword": "And "
});
formatter.match({
  "location": "FileUploadSteps.clickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "success message is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "FileUploadSteps.successMessageIsShown()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/smokeNavigation.feature");
formatter.feature({
  "name": "Navigation to few pages is working",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "User can navigate to homePage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user navigate to homePage",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationSteps.userNavigateToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of homePage is \"Guru99 Bank Home Page\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationSteps.titleOfHomePageIs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login form is present",
  "keyword": "And "
});
formatter.match({
  "location": "NavigationSteps.loginFormIsPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can navigate to newToursPage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user is on homePage",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationSteps.userIsOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on newToursButton",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationSteps.userClickOnNewToursButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of newToursPage is \"Welcome: Mercury Tours\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationSteps.titleOfNewToursPageIs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "main fragment is present",
  "keyword": "And "
});
formatter.match({
  "location": "NavigationSteps.mainFragmentIsPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can navigate to tablePage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user is on homePage",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationSteps.userIsOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on tableDemoLink",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationSteps.userClickOnTableDemoLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of tablePage is correct",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationSteps.titleOfTablePageIsCorrect()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "table is present",
  "keyword": "And "
});
formatter.match({
  "location": "NavigationSteps.tableIsPresent()"
});
formatter.result({
  "status": "passed"
});
});