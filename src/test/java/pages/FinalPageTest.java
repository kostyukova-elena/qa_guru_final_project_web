package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import io.qameta.allure.selenide.AllureSelenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;



@Tag("wildberries")
public class FinalPageTest extends TestBase {

    FinalPage finalPage = new FinalPage();
    ResultComponent resultComponent = new ResultComponent();

//    @Test
//    @DisplayName("Добавление товара в корзину и проверка наличия товара в корзине")
//    void siteSearch() {
//        step("Открываем главную страницу", () -> {
//            finalPage.openPage("https://www.wildberries.ru/");
//        });
//
//        step("Поиск и закрытие всплывающего банера", () -> {
//            finalPage.popupWrapper();
//        });
//
//        step("Кликаем по поисковой строке", () -> {
//            finalPage.setSearchInput();
//        });
//
//
//    }


    @Test
    @DisplayName("Проверка поиска товара на сайте")
    void siteSearch1() {
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


//    @ValueSource(strings = {
//            "Растущий стул",
//            "Куртка зимняя женская"})
//    @ParameterizedTest(name = "Для поискового запроса {0} должен отдавать не пустой список карточек")
//    void searchResultsShouldNotBeEmpty1(String searchQuery) {
//
//        step("Открываем главную страницу", () -> {
//            finalPage.openPage("https://www.wildberries.ru/");
//        });
//
//        step("Поиск и закрытие всплывающего банера", () -> {
//            finalPage.popupWrapper();
//        });
//
//        step("Поиск по запросу", () -> {
//            finalPage.setValue(searchQuery);
//            finalPage.pressEnter();
//        });
//
//        step("Проверка, что коллекция содержит хотя бы один элемент", () -> {
//            finalPage.shouldBe();
//        });
//    }







}


