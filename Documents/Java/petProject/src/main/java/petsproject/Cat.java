package petsproject;

public class Cat extends Pets {
    public Cat(String type, String name) {
        super(type, name);
    }

    public String speak() {
        return "Meow!";
    }
}
