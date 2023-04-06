package github;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        //открыть главную страницу
        open();
        //ввести в поле поиска Selenide и нажать enter
        //кликнуть на первый найденный репозиторий
        //проверка: заголовок "selenide/selenide"

    }


}
