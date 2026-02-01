package pages;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.exist;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.internal.shadowed.jackson.databind.jsonFormatVisitors.JsonValueFormat.PHONE;
import static org.assertj.core.api.Assertions.assertThat;

public class ResultComponent {

    private final ElementsCollection productCards = $$(".ProductTilesListing_root__tVxKR");
private final ElementsCollection productCardNames = $$(".UiProductTileMain_longName__29CCd");


    public ResultComponent shouldBe() {
        productCards.shouldBe(sizeGreaterThan(0));
        return this;
    }

    public ResultComponent findInCards(String value) {
        productCardNames.first().shouldHave(text(value));
        return this;
    }
}
