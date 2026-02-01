package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class FinalPage {

    private final SelenideElement popupWrapper = $("._close_1b9nk_55 popup__close close closeWhite--MwvwP");
    private final SelenideElement searchInput = $(".search-catalog__block search-catalog--active");

    private final SelenideElement cookieWindow = $(".Tooltip_root__EMk_3 Tooltip_whiteTheme__bkjSb");
    private final SelenideElement cookieButton = $(".Tooltip_closeIcon__skwl0");
    private final SelenideElement inputSearch = $(".UiSharedInputSearch_input__G0Un1");
    private final SelenideElement sharedInputSearch = $(".UiSharedInputSearch_search__zN2I2");




    public FinalPage openPage(String address) {
        open(address);
        return this;
    }

//    public FinalPage popupWrapper() {
//        popupWrapper.find(String.valueOf(Condition.exist));
//        if (popupWrapper.exists()) {
//            popupWrapper.click();
//        }
//        return this;
//    }
//
//    public FinalPage setSearchInput(){
//        searchInput.shouldBe(visible).click();
//        return this;
//    }

    public FinalPage acceptCookies() {
        if (cookieWindow.is(visible)) {
            cookieButton.click();
        }

        return this;
    }

    public FinalPage setInputSearch() {
        inputSearch.shouldBe(visible).click();
        return this;
    }

    public FinalPage sharedInputSearch(String value) {
        inputSearch.setValue(value);
        return this;
    }

    public FinalPage setSharedInputSearch() {
        sharedInputSearch.shouldBe(visible).click();
        return this;
    }



}





