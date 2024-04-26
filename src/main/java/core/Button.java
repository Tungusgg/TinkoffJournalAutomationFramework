package core;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.*;



public class Button {

    private String xpath;
    private String title;

    public Button(String xpath) {
        this.xpath = xpath;
    }

    public Button click() {
        $(By.xpath(xpath)).click();
        return this;
    }

    public Button shouldBeExist() {
        $(By.xpath(xpath)).exists();
        return this;
    }
}
