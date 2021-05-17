import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class HomeWorkTest {

    private WebDriver driver;
    JavascriptExecutor js;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\EducationForMyself\\LANIT.Java\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.avito.ru/");
        driver.manage().window().setSize(new Dimension(1382, 744));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testHW() throws InterruptedException {
        driver.findElement(By.id("category")).click();
        {
            WebElement dropdown = driver.findElement(By.id("category"));
            Thread.sleep(1000);// Через mvn clean test не успевает грузиться список
            dropdown.findElement(By.xpath("//option[. = 'Оргтехника и расходники']")).click();
        }
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).sendKeys("Принтер");
        driver.findElement(By.cssSelector(".main-location-3j9by > .main-text-2PaZG")).click();
        driver.findElement(By.cssSelector(".suggest-input-3p8yi")).sendKeys("Владивосток");
        Thread.sleep(1000);// Задержка нужна, т.к. при написании города список не успевает обновиться
        // под него и выбирает город по геопозоции
        driver.findElement(By.xpath("//li[@data-marker=\"suggest(0)\"]")).click();
        driver.findElement(By.cssSelector(".button-size-m-7jtw4")).click();
        js.executeScript("window.scrollTo(0,485)");
        driver.findElement(By.xpath("//div[@data-marker=\"delivery-filter/container\"]")).click();
        driver.findElement(By.cssSelector(".applyButton-root-1KoTq > .button-size-s-3-rn6")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".sort-select-3QxXG > .select-select-3CHiM"));
            dropdown.findElement(By.xpath("//option[. = 'Дороже']")).click();
        }

        System.out.println(driver.findElement(By.xpath("//div[@data-marker=\"item\"][1]/div/div/div/a/h3"))
                .getText() + " " +
                driver.findElement(By.xpath("//div[@data-marker=\"item\"][1]/div/div/div/span/span/span"))
                        .getText());

        System.out.println(driver.findElement(By.xpath("//div[@data-marker=\"item\"][2]/div/div/div/a/h3"))
                .getText() + " " +
                driver.findElement(By.xpath("//div[@data-marker=\"item\"][2]/div/div/div/span/span/span"))
                        .getText());

        System.out.println(driver.findElement(By.xpath("//div[@data-marker=\"item\"][3]/div/div/div/a/h3"))
                .getText() + " " +
                driver.findElement(By.xpath("//div[@data-marker=\"item\"][3]/div/div/div/span/span/span"))
                        .getText());
    }
}
