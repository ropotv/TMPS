package core.models.dto;

import core.models.interfaces.IAnimal;

public class Animal implements IAnimal {
    public String name = "Simple Animal";
    public String color = null;
    public int age = 0;

    @Override
    public void SetName(String name) {
        this.name = name;
    }

    @Override
    public void SetColor(String color) {
        this.color = color;
    }

    @Override
    public void SetAge(int age) {
        this.age = age;
    }

    @Override
    public void Pitch() {
        System.out.println("I am a " + this.name + " and my color is " + this.color + " because I am " + this.age + " years old.");
    }
}
