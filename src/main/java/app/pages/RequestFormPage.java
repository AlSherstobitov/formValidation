package app.pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class RequestFormPage extends BasePage {

    public SelenideElement nameField = $("input[placeholder='ФИО']");
    public SelenideElement companyField = $("input[placeholder='Компания']");
    public SelenideElement emailField = $("input[placeholder='Электронная почта']");
    public SelenideElement phoneField = $("input[placeholder='Мобильный телефон']");
    public SelenideElement nameValidationIndicator = $("input[placeholder='ФИО']").parent().$(".rt-info-icon");
    public SelenideElement companyValidationIndicator = $("input[placeholder='Компания']").parent().$(".rt-info-icon");
    public SelenideElement emailValidationIndicator = $("input[placeholder='Электронная почта']").parent().$(".rt-info-icon");
    public SelenideElement phoneValidationIndicator = $("input[placeholder='Мобильный телефон']")
            .closest("div.form-content__input.sp-b-lightblue")
            .find("div.rt-info-icon.rt-info-icon--ok.rt-info-icon--small");





    public RequestFormPage(String pageUrl) {
        super(pageUrl);
    }
    // Скролл на форму заявки на странице "Мобильная связь"
    public void goToRequestForm() {
        $("#block-rt-ru-b2b-content")
                .find("article")
                .find(".rt-jumbotron__content")
                .find("button")
                .waitUntil(Condition.visible, 7000)
                .click();
    }
    //Заполнение всех полей формы заявки
    public void fillRequestForm(String name, String company, String email, String phone) {
        nameField.setValue(name);
        companyField.setValue(company);
        emailField.setValue(email);
        phoneField.setValue(phone);
    }
    //Проверка валидности значений
    public boolean isNameFieldValid() {
        return nameValidationIndicator.getAttribute("class").contains("rt-info-icon--ok");
    }
    public boolean isCompanyFieldValid() {
        return companyValidationIndicator.getAttribute("class").contains("rt-info-icon--ok");
    }
    public boolean isEmailFieldValid() {
        return emailValidationIndicator.getAttribute("class").contains("rt-info-icon--ok");
    }
    public boolean isPhoneFieldValid() {
        return phoneValidationIndicator.exists();
    }

    //Заполнение полей
    public void fillNameField(String name) {
        nameField.setValue(name);
        nameField.pressEnter();
    }
    public void fillCompanyField(String company) {
        companyField.setValue(company);
        companyField.pressEnter();
    }
    public void fillEmailField(String email) {
        emailField.setValue(email);
        emailField.pressEnter();
    }
    public void fillPhoneField(String phone) {
        phoneField.setValue(phone);
        phoneField.pressEnter();
    }
}