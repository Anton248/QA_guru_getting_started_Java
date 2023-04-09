package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

@SuppressWarnings("doesn't include 'test'")
public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        //открыть главную страницу
        open("https://github.com/");
        //ввести в поле поиска Selenide и нажать enter
        $("input[placeholder='Search GitHub'][name=q]").setValue("Selenide").pressEnter();
        //кликнуть на первый найденный репозиторий
        $$("ul.repo-list li").first().$("a").click();
        //проверка: заголовок "selenide/selenide"
        $$("#repository-container-header").first().shouldHave(text("selenide / selenide"));
        //найти Солцева и навести мышку hover
        //$("a[href='https://github.com/asolntsev']").parent().hover();
        //$$("h2 a.Link--primary").findBy(text("Contributors")).parent().sibling(0).$("img[alt='@asolntsev']").parent().hover();


    }


}
