package steps;

import enums.Category;
import enums.Sort;
import io.cucumber.java.ParameterType;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    private WebDriver driver;
    JavascriptExecutor js;

    @ParameterType(".*")
    public Sort sort(String sort) {
        return Sort.valueOf(sort);
    }

    @ParameterType(".*")
    public Category category(String category) {
        return Category.valueOf(category);
    }


    @Когда("Открыт ресурс Авито")
    public void открытРесурсАвито() {
        System.setProperty("webdriver.chrome.driver", "E:\\EducationForMyself\\LANIT.Java\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1382, 744));
        driver.get("https://www.avito.ru/");
    }

    @И("В выпадающем списке категорий выбрана {category}")
    public void вВыпадающемСпискеКатегорийВыбранаCategory(Category category) throws InterruptedException {
        driver.findElement(By.id("category")).click();
        {
            WebElement dropdown = driver.findElement(By.id("category"));
            dropdown.findElement(By.xpath("//option[. = '" + category.getValue() + "']")).click();
        }
    }

    @И("В поле поиска введено значение {string}")
    public void вПолеПоискаВведеноЗначениеStringForSearch(String stringForSearch) {
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).sendKeys(stringForSearch);
    }

    @Тогда("Кликнуть по выпадающему списку региона")
    public void кликнутьПоВыпадающемуСпискуРегиона() {
        driver.findElement(By.cssSelector(".main-location-3j9by > .main-text-2PaZG")).click();
    }

    @Тогда("В поле регион ввести {string}")
    public void вПолеРегионВвестиCity(String city) throws InterruptedException {
        driver.findElement(By.cssSelector(".suggest-input-3p8yi")).sendKeys(city);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@data-marker=\"suggest(0)\"]")).click();
    }

    @И("Нажата кнопка показать объявление")
    public void нажатаКнопкаПоказатьОбъявление() {
        driver.findElement(By.cssSelector(".button-size-m-7jtw4")).click();
    }

    @Тогда("Открылась страница результаты по запросу {string}")
    public void открыласьСтраницаРезультатыПоЗапросуStringForSearch(String stringForSearch) {
        String text = driver.findElement(By.cssSelector(".page-title-text-WxwN3")).getText();
        Assert.assertTrue(text.contains(stringForSearch));

    }

    @И("Активирован чекбокс только с фотографией")
    public void активированЧекбоксТолькоСФотографией() {
        boolean enabled = driver.findElement(By.xpath("//input[@name=\"withImagesOnly\"]")).isEnabled();
        if (!(enabled)) {
            driver.findElement(By.cssSelector("//input[@name=\"withImagesOnly\"]")).click();
        }
    }

    @И("В выпадающем списке сортировка выбрано значение {sort}")
    public void вВыпадающемСпискеСортировкаВыбраноЗначениеSort(Sort sort) {

        {
            WebElement dropdown = driver.findElement(By.cssSelector(".sort-select-3QxXG > .select-select-3CHiM"));
            dropdown.findElement(By.xpath("//option[. = '" + sort.getValue() + "']")).click();
        }

    }

    @И("В консоль выведено значение название цены {int} первых товаров")
    public void вКонсольВыведеноЗначениеНазваниеЦеныQuantityПервыхТоваров(int quantity) {
        for (int i = 1; i <= quantity; i++) {
            System.out.println(driver.findElement(By.xpath("//div[@data-marker=\"item\"][" + i + "]/div/div/div/a/h3"))
                    .getText() + " " +
                    driver.findElement(By.xpath("//div[@data-marker=\"item\"][" + i + "]/div/div/div/span/span/span"))
                            .getText());
        }
    }

    @И("Закрыть браузер")
    public void закрытьБраузер() {
        driver.close();
    }
}
