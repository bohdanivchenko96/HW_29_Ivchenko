package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DragAndDropPage;
import pages.HomePage;

import static org.junit.Assert.*;

public class DragAndDropSteps {
    HomePage homePage = new HomePage();
    DragAndDropPage dragAndDropPage = new DragAndDropPage();
    @Given("user is on dragAndDrop page")
    public void userIsOnDragAndDropPage() {
        homePage.navigate()
                .getDropDownList()
                .selectPageInDropDownList("Drag and Drop Action");
    }

    @And("success message is not shown")
    public void successMessageIsNotShown() {
        assertFalse(dragAndDropPage.getMessageVisible());
    }

    @When("user drop debit account {string}")
    public void userDropDebitAccount(String arg0) {
        dragAndDropPage.userDropDebitAccount();

    }

    @And("user drop debit amount {string}")
    public void userDropDebitAmount(String arg0) {
        dragAndDropPage.userDropDebitAmount();
    }

    @And("user drop credit account {string}")
    public void userDropCreditAccount(String arg0) {
        dragAndDropPage.userDropCreditAccount();
    }

    @And("user drop credit amount {string}")
    public void userDropCreditAmount(String arg0) {
        dragAndDropPage.userDropCreditAmount();
    }

    @Then("success message is shown drag")
    public void successMessageIsShownDrag() {
        assertTrue(dragAndDropPage.getMessageVisible());
    }
}
