package pages;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.title;

public class BasePage {
    public BasePage(){
        Configuration.baseUrl = "http://demo.guru99.com/Agile_Project/Agi_V1";
        Configuration.startMaximized = true;
    }
    public String getTitle(){
        return title();
    }


}
