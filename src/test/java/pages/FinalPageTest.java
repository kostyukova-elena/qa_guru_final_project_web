package pages;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("etagi")
public class FinalPageTest extends TestBase {
    FinalPage finalPage = new FinalPage();

    @Test
    @DisplayName("Тест для проверки строки поиска на сайте")
    void siteSearch() {
        step("Открываем главную страницу", () -> {
            finalPage.openPage();
        });

    }

}
