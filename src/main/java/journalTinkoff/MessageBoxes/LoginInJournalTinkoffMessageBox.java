package journalTinkoff.MessageBoxes;

import core.Button;
import core.InputField;

public class LoginInJournalTinkoffMessageBox {

    // Кнопка закрыть окно
    public Button closeButton = new Button("//button[contains(@aria-label, 'Закрыть окно')]");

    // Поле "Почта или телефон"
    public InputField mailOrPhoneInputField = new InputField("//input[@placeholder='Почта или телефон']");
}
