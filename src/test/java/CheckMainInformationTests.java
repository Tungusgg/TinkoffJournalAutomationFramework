import base.BaseTest;
import base.Steps;
import journalTinkoff.PanelSteps;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class CheckMainInformationTests extends Steps {

    /**
     * Проверка информации на главной странице
     */
    @Test
    public void checkServicePanel() {
        panelSteps
                .checkTextInHeaderExist("Учебник")
                .checkTextInHeaderExist("Сравнятор")
                .checkTextInHeaderExist("Сообщество")
                .checkTextInSectionsPanel("Расчеты")
                .checkTextInSectionsPanel("Закладки")
                .checkTextInSectionsPanel("Письма")
                .checkTextInSectionsPanel("Оставайтесь")
                .clickButtonInPanel("Закладки")
                .checkAndFillField("Почта или телефон", "ggWP!@#");
    }
}
