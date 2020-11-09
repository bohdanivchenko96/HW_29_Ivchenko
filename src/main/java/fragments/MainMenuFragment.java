package fragments;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainMenuFragment {

    protected SelenideElement rootElement = $("div.row>nav");
    protected ElementsCollection dropDownListElements = $$("a.dropdown-toggle");


    public SelenideElement getRootElement(){
        return rootElement;

    }
    public SelenideElement getDropDownList(){
        return dropDownListElements.first();
    }
}
