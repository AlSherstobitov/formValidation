package app;

import app.pages.MobilePage;
import app.pages.RequestFormPage;

public class App {

    public MobilePage mobilePage;
    public RequestFormPage requestFormPage;

    public App() {
        mobilePage = PageBuilder.buildMobilePage();
        requestFormPage = PageBuilder.buildRequestFormPage();

    }

}
