package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class FinalPage {

    private final SelenideElement popupWrapper = $("._close_1b9nk_55 popup__close close closeWhite--MwvwP");
    private final SelenideElement searchInput = $("#searchInput");
    private final ElementsCollection productCards = $$("article.product-card");

    public FinalPage openPage(String address) {
        open(address);
        return this;
    }

    public FinalPage popupWrapper() {
        popupWrapper.find(String.valueOf(Condition.exist));
        if (popupWrapper.exists()) {
            popupWrapper.click();
        }
        return this;
    }

    public FinalPage setValue(String value) {
        searchInput.setValue(value);
        return this;
    }

    public FinalPage pressEnter() {
        searchInput.pressEnter();
        return this;
    }

    public FinalPage shouldBe() {
        productCards.shouldBe(sizeGreaterThan(0));
        return this;
    }









}
