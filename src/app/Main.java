package app;

import core.factories.DtoFactory;
import core.models.interfaces.IAnimal;

public class Main {

    public static void main(String[] args) {
        IAnimal dog = DtoFactory.CreateDog();
        IAnimal cat = DtoFactory.CreateCat();

        dog.Pitch();
        cat.Pitch();
    }
}
