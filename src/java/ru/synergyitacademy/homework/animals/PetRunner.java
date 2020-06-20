package ru.synergyitacademy.homework.animals;

import ru.synergyitacademy.homework.animals.specialized.Cat;
import ru.synergyitacademy.homework.animals.specialized.Cow;
import ru.synergyitacademy.homework.animals.specialized.Dog;
import ru.synergyitacademy.homework.animals.specialized.Rooster;
import ru.synergyitacademy.homework.animals.specialized.Nanny;
import java.nio.channels.ScatteringByteChannel;

public class PetRunner {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat ();
        Rooster rooster = new Rooster ();
        Cow cow = new Cow ();
        Nanny nanny = new Nanny ();
        dog.setNickName("Тузик");
        dog.setSort("Дворняжка");
        dog.setColor("Черный");
        dog.setLength(0.05); // в метрах
        dog.setWidth(0.02); // в метрах
        dog.setServe (false);
        dog.setAge(5);
        Dog smallDog = new Dog("Крепыш");
        Cat blackCat = new Cat ("Машка");
        Rooster rooster1 = new Rooster ( "Петя" );
        Cow cow1 = new Cow ("Буренка"  );
        cow.setHerbivore ( true );
        Nanny nanny1 = new Nanny ("Белка"  );
        nanny.setHerbivore ( true );
        Pet[] pets = new Pet[] {dog, smallDog,cat,blackCat,rooster,rooster1,cow,cow1,nanny,nanny1};

        for (Pet pet : pets) {
            pet.voice();
        }

        Person hozyain = new Person("Виталий");
        dog.eat(hozyain);
        cat.eat(hozyain);
        cat.sleeping ();
        rooster.eat ( hozyain );
        cow.eat ( hozyain );
        cow.mammal ();
        nanny.eat ( hozyain );
        nanny.mammal ();
    }
}
