package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DifferenceBetweenTwoExpressions {
    @Test
    void findDivAndH2() {
        Configuration.holdBrowserOpen = true;
        open("https://github.com/features/actions");
        //$("div.d-flex a.Link--primary[href='/features/packages']").click(); //работает
        $("div.d-flex").$("a.Link--primary[href='/features/packages']").click();  //не работает

    }
}
