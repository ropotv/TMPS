package core.factories;

import core.models.dto.Cat;
import core.models.dto.Dog;
import core.models.interfaces.IAnimal;

public class DtoFactory {
    public static IAnimal CreateDog() {
        return new Dog();
    }

    public static IAnimal CreateCat() {
        return new Cat();
    }
}
