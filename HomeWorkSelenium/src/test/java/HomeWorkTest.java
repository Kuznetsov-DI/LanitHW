import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public void testHW() {
        driver.findElement(By.id("category")).click();
        {
            WebElement dropdown = driver.findElement(By.id("category"));
            dropdown.findElement(By.xpath("//option[. = 'Оргтехника и расходники']")).click();
        }
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).sendKeys("Принтер");
        String paramForCity = "Владивосток";
        driver.findElement(By.cssSelector(".main-location-3j9by > .main-text-2PaZG")).click();
        driver.findElement(By.cssSelector(".suggest-input-3p8yi")).sendKeys(paramForCity);
        Boolean dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.textToBePresentInElementLocated
                        (By.xpath("//li[@data-marker=\"suggest(0)\"]/span/span/span/strong"), paramForCity));
        driver.findElement(By.xpath("//li[@data-marker=\"suggest(0)\"]")).click();
        driver.findElement(By.cssSelector(".button-size-m-7jtw4")).click();
        WebElement checkDelivery = driver.findElement(By.xpath("//div[@data-marker=\"delivery-filter/container\"]"));
        js.executeScript("arguments[0].scrollIntoView();", checkDelivery);
        driver.findElement(By.xpath("//div[@data-marker=\"delivery-filter/container\"]")).click();
        driver.findElement(By.cssSelector(".applyButton-root-1KoTq > .button-size-s-3-rn6")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".sort-select-3QxXG > .select-select-3CHiM"));
            dropdown.findElement(By.xpath("//option[. = 'Дороже']")).click();
        }

        for (int i =1; i < 4 ; i++) {

            System.out.println(driver.findElement(By.xpath("//div[@data-marker=\"item\"][" + i + "]/div/div/div/a/h3"))
                    .getText() + " " +
                    driver.findElement(By.xpath("//div[@data-marker=\"item\"][" + i + "]/div/div/div/span/span/span"))
                            .getText());

        }
    }
}
