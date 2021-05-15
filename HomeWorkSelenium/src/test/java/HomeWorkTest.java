import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class HomeWorkTest {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\EducationForMyself\\LANIT.Java\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testHW() {
        driver.get("https://www.avito.ru/penza");
        driver.manage().window().setSize(new Dimension(1382, 744));
        driver.findElement(By.id("category")).click();
        {
            WebElement dropdown = driver.findElement(By.id("category"));
            dropdown.findElement(By.xpath("//option[. = 'Любая категория']")).click();
        }
        driver.findElement(By.id("category")).click();
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).sendKeys("Принтер");
        driver.findElement(By.cssSelector(".main-location-3j9by > .main-text-2PaZG")).click();
        driver.findElement(By.cssSelector(".suggest-input-3p8yi")).sendKeys("Владивосток");
        driver.findElement(By.cssSelector(".suggest-suggest_regions-qQeGI")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".button-size-m-7jtw4"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".button-size-m-7jtw4 > .button-textBox-Row9K"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".button-size-m-7jtw4")).click();
        js.executeScript("window.scrollTo(0,65)");
        js.executeScript("window.scrollTo(0,300)");
        js.executeScript("window.scrollTo(0,485)");
        driver.findElement(By.cssSelector(".column-root-N_0Ue > div > .checkbox-checkbox-7igZ6 > .checkbox-label-3AzRS")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".applyButton-root-1KoTq > .button-button-2Fo5k"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".button-primary-1RhOG > .button-textBox-Row9K"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".applyButton-root-1KoTq > .button-button-2Fo5k")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".button-primary-1RhOG > .button-textBox-Row9K"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        js.executeScript("window.scrollTo(0,141)");
        driver.findElement(By.cssSelector(".sort-select-3QxXG > .select-select-3CHiM")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".sort-select-3QxXG > .select-select-3CHiM"));
            dropdown.findElement(By.xpath("//option[. = 'По умолчанию']")).click();
        }
        driver.findElement(By.cssSelector(".sort-select-3QxXG > .select-select-3CHiM")).click();
        js.executeScript("window.scrollTo(0,142)");
        {
            WebElement element = driver.findElement(By.cssSelector("#i2075025699 .link-link-39EVK > .title-root-395AQ"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        js.executeScript("window.scrollTo(0,510)");
        js.executeScript("window.scrollTo(0,200)");
    }
}
