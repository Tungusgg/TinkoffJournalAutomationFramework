package journalTinkoff;

import base.Page.MainPage;

public class PanelSteps {

    MainPage mainPage = new MainPage();

    // Метод проверяет наличие текста в хэдере
    public PanelSteps checkTextInHeaderExist(String text) {
        mainPage.headerPanel.checkText(text);
        return this;
    }

    // Метод проверяет наличие текста в разделах
    public PanelSteps checkTextInSectionsPanel(String text) {
        mainPage.sectionsPanel.checkText(text);
        return this;
    }

    // Метод нажимает на кнопку в панеле Разделы
    public PanelSteps clickButtonInPanel(String buttonName) {
        mainPage.sectionsPanel.clickButton(buttonName);
        return this;
    }

    // Метод заполняет проверяет и заполняет значение поля
    public PanelSteps checkAndFillField(String placeholder, String value) {
        // 1 | Проверяем что поле существует |
        mainPage.journalTinkoffMessageBox.mailOrPhoneInputField.checkFieldExist();
        // 2 | Заполняем поле |
        mainPage.journalTinkoffMessageBox.mailOrPhoneInputField.fill(value);
        // 3 | Проверяем, что значение заполнилось |
        mainPage.journalTinkoffMessageBox.mailOrPhoneInputField.checkingValueByPlaceHolder(placeholder, value);
        return this;
    }
}
