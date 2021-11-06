package com.pb.kozhara.hw6;

public class Veterinarian {
    private String name;{
        this.name = name;
    }
    public static String treatAnimal(Animal animal) {
        return "\n[Ім'я тварини: " + animal.getName() +
                "\nЇжа тварини: " + animal.getFood() +
                "\nсередовище проживання: " + animal.getLocation() + "]";
    }
}
