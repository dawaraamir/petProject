package petsproject;

public class Pets {
        public String name;
        public String type;

    public Pets(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String getType() {
        return type;
        }

        public String speak() {
            return "";
        }
    }