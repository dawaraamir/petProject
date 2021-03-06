package petsproject;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        String petType, petName;
        ArrayList<Pets> petArrayList = new ArrayList<Pets>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();

        for(int i = 1; i <= numberOfPets; i++) {
            System.out.println("What kind of pet is pet #" + i + "?");
            petType = scanner.next();
            System.out.println("Enter pet's name.");
            petName = scanner.next();
            if ("dog".equals(petType.toLowerCase())) {
                petArrayList.add(new Dog(petType, petName));
            } else if ("cat".equals(petType.toLowerCase())) {
                petArrayList.add(new Cat(petType, petName));
            } else if ("monkey".equals(petType.toLowerCase())) {
                petArrayList.add(new Monkey(petType, petName));
            }
        }
        for (Pets petObj : petArrayList) {
            System.out.println(petObj.getName() + " the " + petObj.getType() + " says " + petObj.speak());
        }
    }
    }
