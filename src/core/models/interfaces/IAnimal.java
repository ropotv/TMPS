package core.models.interfaces;

public interface IAnimal {
    public String name = null;
    public String color = null;
    public int age = 0;

    public void SetName(String name);
    public void SetColor(String color);
    public void SetAge(int age);

    public IAnimal Clone();

    public void Pitch();
}
