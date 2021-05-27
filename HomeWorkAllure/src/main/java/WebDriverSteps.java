import io.qameta.allure.Attachment;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WebDriverSteps {

    private WebDriver driver;
    JavascriptExecutor js;

    public WebDriverSteps(WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) driver;
    }

    @Step("Open browser and site Avito")
    public void openPage(String url) {
        driver.get(url);
        driver.manage().window().setSize(new Dimension(1382, 744));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Step("Check categoty in list")
    public void checkCategory(String category) {
        driver.findElement(By.id("category")).click();
        {
            WebElement dropdown = driver.findElement(By.id("category"));
            dropdown.findElement(By.xpath("//option[. = '" + category + "']")).click();
        }
    }

    @Step("Enter text for search")
    public void enterSearch(String text) {
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).sendKeys(text);
    }

    @Step("Click on field 'city'")
    public void clickFieldCity() {
        driver.findElement(By.cssSelector(".main-location-3j9by > .main-text-2PaZG")).click();
    }

    @Step("Enter city name for search" +
            "Click for first field" +
            "And show ads")
    public void enterCityName(String city) {
        driver.findElement(By.cssSelector(".suggest-input-3p8yi")).sendKeys(city);
        Boolean dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.textToBePresentInElementLocated
                        (By.xpath("//li[@data-marker=\"suggest(0)\"]/span/span/span/strong"), city));
        driver.findElement(By.xpath("//li[@data-marker=\"suggest(0)\"]")).click();
        driver.findElement(By.cssSelector(".button-size-m-7jtw4")).click();
    }

    @Step("Check checkbox delivery" +
            "And click if his not active")
    public void checkboxDelivery() {
        WebElement checkDelivery = driver.findElement(By.xpath("//div[@data-marker=\"delivery-filter/container\"]"));
        js.executeScript("arguments[0].scrollIntoView();", checkDelivery);
        driver.findElement(By.xpath("//div[@data-marker=\"delivery-filter/container\"]")).click();
        driver.findElement(By.cssSelector(".applyButton-root-1KoTq > .button-size-s-3-rn6")).click();
    }

    @Step("Select a filter")
    public void selectAFilter(String filter) {
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".sort-select-3QxXG > .select-select-3CHiM"));
            dropdown.findElement(By.xpath("//option[. = '" + filter + "']")).click();
        }
    }

    @Step("Out first results and prices")
    public void outResults(int count) {
        for (int i = 1; i <= count; i++) {

            System.out.println(driver.findElement(By.xpath("//div[@data-marker=\"item\"][" + i + "]/div/div/div/a/h3"))
                    .getText() + " " +
                    driver.findElement(By.xpath("//div[@data-marker=\"item\"][" + i + "]/div/div/div/span/span/span"))
                            .getText());
        }
    }

    @Step("Out browser")
    public void quit() {
        driver.quit();
    }

    @Attachment
    @Step("Make screen shot page")
    public byte[] makeScreenShot() {

        Screenshot screenshot = new AShot().takeScreenshot(driver);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            ImageIO.write(screenshot.getImage(), "PNG", buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toByteArray();
    }


}
