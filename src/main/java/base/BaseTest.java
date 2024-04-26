package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;

abstract public class BaseTest {

    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.timeout = 30000;
        Configuration.browserSize = "1920x1080";
        open("https://journal.tinkoff.ru/");
    }

    @Before
    public void init() {
        setUp();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
