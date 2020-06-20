package ru.synergyitacademy.homework.animals.specialized;

import ru.synergyitacademy.homework.animals.Pet;

public final class Dog extends Pet {

    private String nickName = "Неизвестный";
    private String sort;
    private boolean serve;

    {
        nickName = "Безымянный";
        Integer amountSort = AMOUNT_SORT;
    }

    public Dog() {
        super("Собака");
    }

    public Dog(String name) {
        this();
        this.nickName = name;
    }
    public void setServe(boolean serve){
        this.serve = serve;
    }
    public boolean getServe() {
        return this.serve;
    }
    @Override
    public void voice() {
        System.out.printf("%s издает гав-гав!\n", this.nickName);
    }

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
