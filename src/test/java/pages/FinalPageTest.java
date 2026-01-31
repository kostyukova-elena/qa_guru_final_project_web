package pages;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.qameta.allure.Allure.step;

@Tag("wildberries")
public class FinalPageTest extends TestBase {
    FinalPage finalPage = new FinalPage();

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

    @Test
    @DisplayName("Добавления товара в корзину")
    void siteSearch() {
        step("Открываем главную страницу", () -> {
            finalPage.openPage("https://www.wildberries.ru/");
        });
    }

}
