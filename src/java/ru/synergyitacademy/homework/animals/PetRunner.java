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
        Dog smallDog = new Dog("Крепыш");
        Cat blackCat = new Cat ("Машка");
        Rooster rooster1 = new Rooster ( "Петя" );
        Cow cow1 = new Cow ("Буренка"  );
        Nanny nanny1 = new Nanny ("Белка"  );
        Pet[] pets = new Pet[] {dog, smallDog};

        for (Pet pet : pets) {
            pet.voice();
        }
        Pet[] pets1 = new Pet[] {cat, blackCat};

        for (Pet pet : pets1) {
            pet.voice();
        }
        Pet[] pets2 = new Pet[] {rooster,rooster1};
        for (Pet pet : pets2) {
            pet.voice();
        }
        Pet[] pets3 = new Pet[] {cow,cow1};
        for (Pet pet : pets3) {
            pet.voice();
        }
        Pet[] pets4 = new Pet[] {nanny,nanny1};
        for (Pet pet : pets4) {
            pet.voice();
        }
        Person hozyain = new Person("Виталий");
        dog.eat(hozyain);
        cat.eat(hozyain);
        rooster.eat ( hozyain );
        cow.eat ( hozyain );
        nanny.eat ( hozyain );
    }
}
