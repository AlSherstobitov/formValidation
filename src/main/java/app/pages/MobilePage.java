package app.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class MobilePage extends BasePage {

    public MobilePage(String pageUrl) {
        super(pageUrl);
    }

    public void goToRequestForm() {
        // Скролл на форму заявки на странице "Мобильная связь"
        $("#block-rt-ru-b2b-content")
                .find("article")
                .find(".rt-jumbotron__content")
                .find("button")
                .waitUntil(Condition.visible, 7000)
                .click();
    }
}
