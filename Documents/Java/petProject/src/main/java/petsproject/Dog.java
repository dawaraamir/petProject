package petsproject;

public class Dog extends Pets {
    public Dog(String type, String name) {
        super(type, name);
    }

    @Override
    public String speak() {
        return "Bark bark!";
    }
}
