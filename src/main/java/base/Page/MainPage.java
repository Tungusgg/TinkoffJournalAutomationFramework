package base.Page;

import core.Panel;
import journalTinkoff.MessageBoxes.LoginInJournalTinkoffMessageBox;

/**
 * Класс главной страницы журнала
 */
public class MainPage {

    // Панель хедера
    public Panel headerPanel = new Panel("Основная навигация");
    // Панель разделов
    public Panel sectionsPanel = new Panel("Разделы");
    // Вслпывающее окно "Войдите в Тинькофф журнал"
    public LoginInJournalTinkoffMessageBox journalTinkoffMessageBox = new LoginInJournalTinkoffMessageBox();
}
