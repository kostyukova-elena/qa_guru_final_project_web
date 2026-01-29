package pages;

import static com.codeborne.selenide.Selenide.open;

public class FinalPage {

    public FinalPage openPage(String address) {
        open(address);
        return this;
    }
}
