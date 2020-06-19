package ru.synergyitacademy.homework.animals.specialized;
import ru.synergyitacademy.homework.animals.Pet;
public class Cow extends Pet {
    private String nickName = "Неизвестный";
    private String sort;

    {
        nickName = "not_name";
        Integer amountSort = AMOUNT_SORT;
    }

    public Cow() {
        super("Корова");
    }

    public Cow(String name) {
        this();
        this.nickName = name;
    }

    @Override
    public  void voice( ) {
        System.out.printf("%s издает му!\n", this.nickName);
    };
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
