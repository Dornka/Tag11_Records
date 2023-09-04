package org.example;
public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Alice", 30, "123 Main St");
        Owner owner2 = new Owner("Bob", 25, "456 Elm St");

        Species catSpecies = new Species("Cat", 100);
        Species dogSpecies = new Species("Dog", 200);


        Animal animal1 = new Animal(1, "Fluffy", catSpecies, 3, owner1);
        Animal animal2 = new Animal(2, "Rex", dogSpecies, 5, owner2);

        System.out.println(animal1);
        System.out.println(animal2);
    }
}
