package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class DifferenceBetweenTwoExpressions {
    @Test
    void withAndWithoutDiv() {
        Configuration.holdBrowserOpen = true;
        open("https://github.com/selenide/selenide");

        //works
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$$("ul li").first().hover();

        //doesn't work
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest("div.BorderGrid-cell").$$("ul li").first().hover();
    }
}
