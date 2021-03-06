package ru.synergyitacademy.homework.animals.specialized;
import ru.synergyitacademy.homework.animals.Pet;
public class Nanny extends Pet {
    private String nickName = "Неизвестный";
    private String sort;
    private boolean herbivore;
    {
        nickName = "no name";
        Integer amountSort = AMOUNT_SORT;
    }

    public Nanny() {
        super("Коза");
    }

    public Nanny(String name) {
        this();
        this.nickName = name;
    }
    public void setHerbivore(boolean herbivore){
        this.herbivore = herbivore;
    }
    public boolean getHerbivore() {
        return this.herbivore;
    }
    public void mammal() {
        if (this.herbivore) {
            System.out.println ( this.getType () + " " + this.getNickName () + " " + "даёт молоко" );
        } else {
            System.out.println ( this.getType () + " " + this.getNickName () + " " + "не дает молоко" );
        }
    }
    @Override
    public  void voice( ) {
        System.out.printf("%s издает ме!\n", this.nickName);
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
