package petsproject;

public class Monkey extends Pets {
    public Monkey(String type, String name) {
        super(type, name);
    }

    @Override
    public String speak() {
        return "Ooo, Ooo, Ahh, Ahh!";
    }
}
