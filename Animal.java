import java.util.*;
public class Animal
{
    // Defining the eat() method outside of main()
    public void eat() 
    {
        System.out.println("Eating");
    }

    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animal.eat();  // Calling the eat() method from the Animal class
        Dog dog = new Dog();
        dog.bark();
    }
}

class Dog extends Animal
{
    // Corrected the spelling of System.out.println
    public void bark() 
    {
        System.out.println("Barking");
    }
  
}
