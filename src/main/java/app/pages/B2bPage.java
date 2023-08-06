package app.pages;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.$;

public class B2bPage extends BasePage {

    public B2bPage(String pageUrl) {
        super(pageUrl);
    }

    public void goToMobilePage() {
        // Переход на страницу "Мобильная связь"

        // Selenide.open(pageUrl);
        // $(By.linkText("Мобильная связь")).click();
    }
}
