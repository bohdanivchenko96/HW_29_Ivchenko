package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CustomerHomePage extends BasePage{

    private SelenideElement welcomeMessage = $("marquee.heading3");

    public String checkWelcomeMessage(){
       return welcomeMessage.shouldBe(Condition.visible).getText();
    }
}
