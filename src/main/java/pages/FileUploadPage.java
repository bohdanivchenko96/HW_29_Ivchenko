package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FileUploadPage extends BasePage{

    private SelenideElement uploadButton = $("input[type='file']");
    private SelenideElement submitButton = $("button#submitbutton");
    private SelenideElement message = $("h3.demo>center");

    public void clickOnUploadButton() {
        uploadButton.shouldBe(Condition.visible).click();
    }

    public void clickonSubmitButton() {
        submitButton.shouldBe(Condition.visible).click();
    }

    public boolean getMessage() {
       return message.shouldBe(Condition.visible).getText().contains("has been successfully uploaded");
    }
}
