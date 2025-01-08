import java.util.*;
public class HomeAnimal
{
    // Defining the eat() method outside of main()
    public void eat() 
    {
        System.out.println("Eating");
    }

    public static void main(String[] args)
    {
        HomeAnimal animal = new HomeAnimal();
        animal.eat();  // Calling the eat() method from the Animal class
        Dog dog = new Dog();
        dog.bark();
        Pet pet = new Pet();
        pet.weep();
        Cat cat = new Cat();
        cat.meow();
        Parrot parrot = new Parrot();
        parrot.speaks();


    }
}

class Dog extends HomeAnimal
{
    // Corrected the spelling of System.out.println
    public void bark() 
    {
        System.out.println("Barking");
    }
}
class Pet extends HomeAnimal 
{
    // Corrected the spelling of System.out.println
    public void weep() 
    {
        System.out.println("Weeping");
    }
}
class Cat extends HomeAnimal
{
    // Corrected the spelling of System.out.println
    public void meow() 
    {
        System.out.println("Smiling");
    }
}
class Parrot extends HomeAnimal
{
    // Corrected the spelling of System.out.println
    public void speaks() 
    {
        System.out.println("Speaking");
    }
}

