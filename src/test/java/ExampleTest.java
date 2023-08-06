import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class ExampleTest extends A_BaseTest {

    private String testName;
    private String testCompany;
    private String testEmail;
    private String testPhone;

    @Test(dataProvider = "formData")
    public void orderFormFilling(String name, String company, String email, String phone) {
        app.requestFormPage.open();
        app.requestFormPage.goToRequestForm();
        app.requestFormPage.fillRequestForm(name, company, email, phone);

        testName = name;
        testCompany = company;
        testEmail = email;
        testPhone = phone;
    }

    @Test(dependsOnMethods = "orderFormFilling")
    public void valideNameFields() {
        app.requestFormPage.open();
        app.mobilePage.goToRequestForm();
        app.requestFormPage.fillNameField(testName);
        assertTrue(app.requestFormPage.isNameFieldValid(), "Значение "+ testName+" не валидно");
    }

    @Test(dependsOnMethods = "orderFormFilling")
    public void valideCompanyFields() {
        app.requestFormPage.open();
        app.mobilePage.goToRequestForm();
        app.requestFormPage.fillCompanyField(testCompany);
        assertTrue(app.requestFormPage.isCompanyFieldValid(), "Значение "+ testCompany+" не валидно");
    }

    @Test(dependsOnMethods = "orderFormFilling")
    public void valideEmailFields() {
        app.requestFormPage.open();
        app.mobilePage.goToRequestForm();
        app.requestFormPage.fillEmailField(testEmail);
        assertTrue(app.requestFormPage.isEmailFieldValid(), "Значение "+ testEmail+" не валидно");
    }

    @Test(dependsOnMethods = "orderFormFilling")
    public void validePhoneFields() {
        app.requestFormPage.open();
        app.mobilePage.goToRequestForm();
        app.requestFormPage.fillPhoneField(testPhone);
        assertTrue(app.requestFormPage.isPhoneFieldValid(), "Значение "+ testPhone+" не валидно");
    }
}