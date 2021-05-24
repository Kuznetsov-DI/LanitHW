package steps;

import enums.Category;
import enums.Sort;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    private WebDriver driver;
    JavascriptExecutor js;

    @Дано("Открыть браузер")
    public void открытБраузер(){
        System.setProperty("webdriver.chrome.driver", "E:\\EducationForMyself\\LANIT.Java\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1382, 744));
    }

    @Когда("Открыт ресурс Авито")
    public void открытРесурсАвито() {
        driver.get("https://www.avito.ru/");
    }

    @И("В выпадающем списке категорий выбрана {category>}")
    public void вВыпадающемСпискеКатегорийВыбранаCategory( Category category) {
        driver.findElement(By.id("category")).click();
        {
            WebElement dropdown = driver.findElement(By.id("category"));
            dropdown.findElement(By.xpath("//option[. = '"+ category +"']")).click();
        }
    }

    @И("В поле поиска введено значение <StringForSearch>")
    public void вПолеПоискаВведеноЗначениеStringForSearch() {
    }

    @Тогда("Кликнуть по выпадающему списку региона")
    public void кликнутьПоВыпадающемуСпискуРегиона() {
    }

    @Тогда("В поле регион ввести <city>")
    public void вПолеРегионВвестиCity() {
    }

    @И("Нажата кнопка показать объявление")
    public void нажатаКнопкаПоказатьОбъявление() {
    }

    @Тогда("Открылась страница результаты по запросу <StringForSearch>")
    public void открыласьСтраницаРезультатыПоЗапросуStringForSearch() {
    }

    @И("Активирован чекбокс только с фотографией")
    public void активированЧекбоксТолькоСФотографией() {
    }

    @И("В выпадающем списке сортировка выбрано значение {sort}")
    public void вВыпадающемСпискеСортировкаВыбраноЗначениеSort(Sort sort) {
    }

    @И("В консоль выведено значение название цены <quantity> первых товаров")
    public void вКонсольВыведеноЗначениеНазваниеЦеныQuantityПервыхТоваров() {
    }
}
