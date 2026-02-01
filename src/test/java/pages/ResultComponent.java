package pages;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

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
