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
    void siteSearch1() {
        step("Открываем главную страницу", () -> {
            finalPage.openPage("https://www.etagi.com/");
        });
    }

    @Test
    @DisplayName("Тест для проверки строки поиска на сайте")
    void siteSearch2() {
        step("Открываем главную страницу", () -> {
            finalPage.openPage("https://strana.com/");
        });
    }

    @Test
    @DisplayName("Тест для проверки строки поиска на сайте")
    void siteSearch3() {
        step("Открываем главную страницу", () -> {
            finalPage.openPage("https://tyumen.megafon.ru/");
        });
    }

    @Test
    @DisplayName("Тест для проверки строки поиска на сайте")
    void siteSearch4() {
        step("Открываем главную страницу", () -> {
            finalPage.openPage("https://edadeal.ru/");
        });
    }

    @Test
    @DisplayName("Тест для проверки строки поиска на сайте")
    void siteSearch5() {
        step("Открываем главную страницу", () -> {
            finalPage.openPage("https://dpd.ru/");
        });
    }

}
