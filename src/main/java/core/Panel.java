package core;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Panel {
    private String rootXpath;
    private String rootLocator;

    public Panel(String name) {
        this.rootXpath = "(//nav[contains(@aria-label, '" + name + "')])[1]";
    }

//    public Panel buttonShouldBeExist() {
//        $(By.xpath(rootXpath)).shouldBe(exist);
//        return this;
//    }

    public Panel checkText(String text) {
        $(By.xpath(rootXpath + "//span[contains(text(), '" + text + "')]")).shouldBe(visible);
        return this;
    }

    public Panel clickButton(String buttonName) {
        $(By.xpath(rootXpath + "//span[contains(text(), '" + buttonName + "')]/../..")).click();
        return this;
    }
}
