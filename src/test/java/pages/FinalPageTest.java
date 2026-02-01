package pages;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

@Tag("tests")
public class FinalPageTest extends TestBase {

    FinalPage finalPage = new FinalPage();
    ResultComponent resultComponent = new ResultComponent();

    @Test
    @DisplayName("Проверка поиска товара на сайте")
    void productSearch() {
        step("Открываем главную страницу", () -> {
            finalPage.openPage("https://www.vprok.ru/");
        });

        step("Закрываем банер с куки", () -> {
            finalPage.acceptCookies();
        });

        step("Кликаем по полю поиска", () -> {
            finalPage.setInputSearch();
        });

        step("Вводим слово для поиска Сливки", () -> {
            finalPage.sharedInputSearch("Сливки");
        });

        step("Кликаем по кнопке Найти", () -> {
            finalPage.setSharedInputSearch();
        });

        step("Проверяем результат", () -> {
            resultComponent.shouldBe();
        });

        step("Проверяем результат", () -> {
            resultComponent.findInCards("Сливки");
        });
    }

    @Test
    @DisplayName("Добавление товара в корзину")
    void AddingAnItemToTheCart() {
        step("Открываем главную страницу", () -> {
            finalPage.openPage("https://www.vprok.ru/");
        });

        step("Закрываем банер с куки", () -> {
            finalPage.acceptCookies();
        });

        step("Кликаем по полю поиска", () -> {
            finalPage.setInputSearch();
        });

        step("Вводим слово для поиска Шоколад", () -> {
            finalPage.sharedInputSearch("Шоколад");
        });

        step("Кликаем по кнопке Найти", () -> {
            finalPage.setSharedInputSearch();
        });

        step("Добавляем товар в корзину", () -> {
            finalPage.setAddingProduct();
        });


    }
}


