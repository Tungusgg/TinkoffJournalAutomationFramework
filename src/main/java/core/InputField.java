package core;


import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InputField {

    private String rootXpath;

    public InputField(String rootXpath) {
        this.rootXpath = rootXpath;
    }

    // Метод вставляет текст в инпут поле
    public InputField fill(String text) {
        $(By.xpath(rootXpath)).clear();
        $(By.xpath(rootXpath)).sendKeys(text);
        return this;
    }

    // Метод проверяет значение в инпут поле по placeholder
    public InputField checkingValueByPlaceHolder(String placeHolder, String value) {
        $(By.xpath("//input[@placeholder='" + placeHolder + "' and contains(@value, '" + value + "')]"))
                .shouldBe(Condition.exist);
        return this;
    }

    // Метод проверяет, что поле существует
    public InputField checkFieldExist() {
        $(By.xpath(rootXpath)).shouldBe(Condition.exist);
        return this;
    }
}
