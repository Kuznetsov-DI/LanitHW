import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkTest {

    private WebDriverSteps steps;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\EducationForMyself\\LANIT.Java\\chromedriver\\chromedriver.exe");
        steps = new WebDriverSteps(new ChromeDriver());
    }

    @AfterEach
    public void tearDown() {
        steps.quit();
    }

    @Test
    public void outputOfExpensivePrinters() {
        steps.openPage("https://www.avito.ru/");
        steps.makeScreenShot();
        steps.checkCategory("Оргтехника и расходники");
        steps.makeScreenShot();
        steps.enterSearch("Принтер");
        steps.makeScreenShot();
        steps.clickFieldCity();
        steps.makeScreenShot();
        steps.enterCityName("Владивосток");
        steps.makeScreenShot();
        steps.checkboxDelivery();
        steps.makeScreenShot();
        steps.selectAFilter("Дороже");
        steps.makeScreenShot();
        steps.outResults(3);
        steps.makeScreenShot();
    }
}