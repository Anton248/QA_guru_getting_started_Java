package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {

    @Test
    void andreySolntsevShouldBeTheFirstContributor() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

        //открыть страничку репозитория Селенида
        open("https://github.com/selenide/selenide");

        //найти Солнцева и навести мышку hover
        //$("a[href='https://github.com/asolntsev']").parent().hover();
        // $("div.Layout-sidebar").$$("h2 a.Link--primary").findBy(text("Contributors"))
        //      .parent().sibling(0).$("img[alt='@asolntsev']").parent().hover();

        //подвести мышку к первому автору из блока Contributors
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$$("ul li").first().hover();

        //убедиться, что во всплывающем окне есть текст Andrei Solntsev
        //$$("div.Popover.js-hovercard-content").findBy(text("Andrei Solntsev")).shouldHave(text("Andrei Solntsev"));
        $$("div.Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));



    }
}
