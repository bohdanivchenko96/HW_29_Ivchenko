package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import fragments.MainMenuFragment;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage{
    private MainMenuFragment mainMenuFragment = new MainMenuFragment();

    private SelenideElement loginForm = $("form[name='frmLogin']");
    private SelenideElement newToursButton = $x("//a[contains(text(), 'New Tours')]");
    private SelenideElement loginNameField = $("input[name='uid']");
    private SelenideElement passwordField = $("input[type='password']");
    private SelenideElement loginButton = $("input[name='btnLogin']");

    public HomePage(){
    }

    public MainMenuFragment getMainMenuFragment() {
        return mainMenuFragment;
    }
    public boolean isLoginFormPresent(){
        return loginForm.shouldBe(Condition.visible).isDisplayed();
    }

    public HomePage navigate(){
        open("/");
        return this;
    }
    public void enterLoginName(String name){
        loginNameField.shouldBe(Condition.visible).setValue(name);
    }

    public void enterPassword(String password){
        passwordField.setValue(password);
    }

    public void clickOnNewToursButton(){
        newToursButton.click();
    }

    public void clickLoginButton() {
        loginButton.shouldBe(Condition.visible).click();
    }
    public String getMessageFromPopup(){
        return WebDriverRunner.getWebDriver().switchTo().alert().getText();
    }
    public void closeAlert(){
        WebDriverRunner.getWebDriver().switchTo().alert().accept();
    }

    public HomePage getDropDownList(){
        mainMenuFragment.getDropDownList().click();
        return this;
    }
    public void selectPageInDropDownList(String pageName){
        SelenideElement pageInDropDownList = $x("//a[contains(text(), '" + pageName + "')]");
        pageInDropDownList.click();
    }

}
