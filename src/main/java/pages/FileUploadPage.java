package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FileUploadPage extends BasePage{

    private SelenideElement uploadButton = $("input[type='file']");
    private SelenideElement submitButton = $("button#submitbutton");
    private SelenideElement message = $("button#submitbutton");

    public void clickOnUploadButton() {
        uploadButton.shouldBe(Condition.visible).click();
    }

    public void clickonSubmitButton() {
        submitButton.shouldBe(Condition.visible).click();
    }

    public String getMessage() {
       return message.shouldBe(Condition.visible).getText();
    }
}
