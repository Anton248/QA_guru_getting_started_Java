package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

@SuppressWarnings("doesn't include 'test'")
public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        //открыть главную страницу
        open("https://github.com/");
        //ввести в поле поиска Selenide и нажать enter
        $("[placeholder='Search GitHub'").setValue("Selenide").pressEnter();
        //кликнуть на первый найденный репозиторий
        $$("ul.repo-list li").first().click();
        //проверка: заголовок "selenide/selenide"

        sleep(6000);

    }


}
