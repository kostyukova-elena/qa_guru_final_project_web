package pages;

import static com.codeborne.selenide.Selenide.open;

public class FinalPage {

    public FinalPage openPage() {
        open("https://www.etagi.com/");
        return this;
    }
}
