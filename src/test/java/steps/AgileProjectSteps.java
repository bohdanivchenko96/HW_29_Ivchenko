package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CustomerHomePage;
import pages.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AgileProjectSteps {
    HomePage homePage = new HomePage();
    CustomerHomePage customerHomePage = new CustomerHomePage();
    @Given("user is on home page")
    public void userIsOnHomePage() {
        homePage.navigate();
    }

    @When("user navigates to agile page")
    public void userNavigatesToAgilePage() {

    }

    @And("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String login, String password) {
        homePage.enterLoginName(login);
        homePage.enterPassword(password);
    }

    @And("click login button")
    public void clickLoginButton() {
        homePage.clickLoginButton();
    }

    @Then("welcome message is correct")
    public void welcomeMessageIsCorrect() {
        String welcomeMessage = "Welcome To Customer's Page of Guru99 Bank";
        assertEquals(welcomeMessage, customerHomePage.checkWelcomeMessage());
    }

    @Then("unvalid credentials message is shown")
    public void unvalidCredentialsMessageIsShown() {
        String unvalidCredentialsMessage = "User or Password is not valid";
        assertEquals(unvalidCredentialsMessage, homePage.getMessageFromPopup());
        homePage.closeAlert();
    }

    @When("user click button")
    public void userClickButton(String buttonName) {

    }

    @And("add file path")
    public void addFilePath() {

    }
}
