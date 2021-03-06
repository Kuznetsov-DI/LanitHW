#language: ru
@2

Функционал: "Поиск на авито"

  Структура сценария: "Найдем самые дорогие принтеры и самые дешевые мониторы на авито"
    Когда Открыт ресурс Авито
    И В выпадающем списке категорий выбрана <category>
    И В поле поиска введено значение "<StringForSearch>"
    Тогда Кликнуть по выпадающему списку региона
    Тогда В поле регион ввести "<city>"
    И Нажата кнопка показать объявление
    Тогда Открылась страница результаты по запросу "<StringForSearch>"
    И Активирован чекбокс только с фотографией
    И В выпадающем списке сортировка выбрано значение <sort>
    И В консоль выведено значение название цены <quantity> первых товаров
    И Закрыть браузер

    Примеры: :
  | StringForSearch | city        | quantity |category              |sort    |
  | Принтер         | Владивосток | 3        | оргтехникаИРасходники|дороже  |
  | Монитор         | Краснодар   | 6        |товарыДляКомпьютера   |дешевле |
