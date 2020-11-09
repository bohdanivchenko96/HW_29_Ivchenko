package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FileUploadPage;
import pages.HomePage;

import static org.junit.Assert.assertEquals;

public class FileUploadSteps {
    HomePage homePage = new HomePage();
    FileUploadPage fileUploadPage = new FileUploadPage();
    @Given("user is on uploadFilePage")
    public void userIsOnUploadFilePage() {
        homePage.navigate()
                .getDropDownList()
                .selectPageInDropDownList("File Upload");
    }

    @And("title of page is {string}")
    public void titleOfPageIs(String title) {
       assertEquals(title, fileUploadPage.getTitle());
    }

    @When("user click {string} button")
    public void userClickButton(String buttonName) {
        //fileUploadPage.clickOnUploadButton();
    }

    @And("click {string} button")
    public void clickButton(String buttonName) {
        fileUploadPage.clickonSubmitButton();
    }

    @Then("success message is shown")
    public void successMessageIsShown() {
        String text = "1 file has been successfully uploaded.";
        assertEquals(text, fileUploadPage.getMessage());
    }
}
