package app;

import app.pages.MobilePage;
import app.pages.RequestFormPage;

public class PageBuilder {

    public static MobilePage buildMobilePage() {
        return new MobilePage("/telephony/mobile");
    }

    public static RequestFormPage buildRequestFormPage() {
        return new RequestFormPage("/telephony/mobile");
    }
}
