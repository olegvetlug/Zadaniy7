package ru.synergyitacademy.homework.animals.specialized;

import ru.synergyitacademy.homework.animals.Pet;

public class Cat extends Pet {
    private String nickName = "Неизвестный";
    private String sort;
    private boolean sleep;
    {
        nickName = "no name";
        Integer amountSort = AMOUNT_SORT;
    }

    public Cat() {
        super("Кошка");
    }

    public Cat(String name) {
        this();
        this.nickName = name;
    }
    public void setSleep(boolean sleep){
        this.sleep = sleep;
    }
    public boolean getSleep(){
        return this.sleep;
    }
    public void sleeping() {
        if (sleep) {
            System.out.println ( this.getType () + " " + this.getNickName () + " " + "спит" );
        } else {
            System.out.println ( this.getType () + " " + this.getNickName () + " " + "не спит" );
        }
    }
    @Override
    public  void voice( ) {
        System.out.printf("%s издает мяу-мяу!\n", this.nickName);
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


