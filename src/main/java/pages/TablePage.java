package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TablePage extends BasePage{
    private SelenideElement table = $("body>table");


    public boolean tableIsPresent(){
        return table.shouldBe(Condition.visible).isDisplayed();
    }
}

