package enums;

public enum Sort {

    ПоУмолчанию("По умолчанию"),
    Дешевле("Дешевле"),
    Дороже("Дороже"),
    ПоДате(" По дате");

    public String value;

    public String getValue() {
        return value;
    }


    Sort (String value) {
        this.value = value;
    }
}
