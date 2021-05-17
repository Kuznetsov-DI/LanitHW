package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @When("Открыт ресурс Авито" )
    public void открытРесурсАвито() {
    }

    @And("В выпадающем списке категорий выбрана \\{category>}" )
    public void вВыпадающемСпискеКатегорийВыбранаCategory() {
    }

    @And("В поле поиска введено значение <StringForSearch>" )
    public void вПолеПоискаВведеноЗначениеStringForSearch() {
    }

    @Then("Кликнуть по выпадающему списку региона" )
    public void кликнутьПоВыпадающемуСпискуРегиона() {
    }

    @Then("в поле регион ввести <city>" )
    public void вПолеРегионВвестиCity() {
    }

    @And("нажата кнопка показать объявление" )
    public void нажатаКнопкаПоказатьОбъявление() {
    }

    @Then("открылась страница результаты по запросу <StringForSearch>" )
    public void открыласьСтраницаРезультатыПоЗапросуStringForSearch() {
    }

    @And("Активирован чекбокс только с фотографией" )
    public void активированЧекбоксТолькоСФотографией() {
    }

    @And("В выпадающем списке сортировка выбрано значение \\{sort}" )
    public void вВыпадающемСпискеСортировкаВыбраноЗначениеSort() {
    }

    @And("В консоль выведено значение название цены <quantity> первых товаров" )
    public void вКонсольВыведеноЗначениеНазваниеЦеныQuantityПервыхТоваров() {
    }
}
