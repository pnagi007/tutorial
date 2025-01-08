import java.util.*;
public class PetAnimal
{
    // Defining the eat() method outside of main()
    public void eat() 
    {
        System.out.println("Eating");
    }

    public static void main(String[] args)
    {
        PetAnimal animal = new PetAnimal();
        animal.eat();  // Calling the eat() method from the Animal class
        Dog dog = new Dog();
        dog.bark();
        Pet pet = new Pet();
        pet.weep();
    }
}

class Dog extends PetAnimal
{
    // Corrected the spelling of System.out.println
    public void bark() 
    {
        System.out.println("Barking");
    }
}
class Pet extends Dog
{
    // Corrected the spelling of System.out.println
    public void weep() 
    {
        System.out.println("Weeping");
    }
}

