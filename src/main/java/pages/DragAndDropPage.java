package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DragAndDropPage extends BasePage{

    private SelenideElement message = $("div#equal>a[class='button button-green']");
    private SelenideElement From1 = $x("//*[@id='credit2']/a");
    private SelenideElement To1 = $x("//*[@id='bank']/li");
    private SelenideElement From2 = $x("//*[@id='credit1']/a");
    private SelenideElement To2 = $x("//*[@id='loan']/li");
    private SelenideElement From3 = $x("//*[@id='fourth']/a");
    private SelenideElement To3 = $x("//*[@id='amt7']/li");
    private SelenideElement From4 = $x("//*[@id='fourth']/a");
    private SelenideElement To4 = $x("//*[@id='amt8']/li");



    public boolean getMessageVisible(){
       return message.isDisplayed();
    }

    public void userDropDebitAccount(){
        Actions act = new Actions(WebDriverRunner.getWebDriver());
        From1.shouldBe(Condition.visible);
        act.dragAndDrop(From1, To1).build().perform();
    }

    public void userDropDebitAmount() {
        Actions act = new Actions(WebDriverRunner.getWebDriver());
        From2.shouldBe(Condition.visible);
        act.dragAndDrop(From2, To2).build().perform();
    }

    public void userDropCreditAccount() {
        Actions act = new Actions(WebDriverRunner.getWebDriver());
        From3.shouldBe(Condition.visible);
        act.dragAndDrop(From3, To3).build().perform();
    }

    public void userDropCreditAmount() {
        Actions act = new Actions(WebDriverRunner.getWebDriver());
        From4.shouldBe(Condition.visible);
        act.dragAndDrop(From4, To4).build().perform();
    }
}
