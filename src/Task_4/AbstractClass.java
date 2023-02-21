package Task_4;

import java.util.ArrayList;

public class AbstractClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Wolf", "Big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 0.5));
        for (Animal animal : animals) {
            doAnimalStuff(animal);
        }
    }
    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
