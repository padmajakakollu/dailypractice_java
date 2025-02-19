package interfaceExample;

// Define an interface
interface Animal1 {
    // Abstract method (does not have a body)
    void makeSound();

    // Default method
    default void sleep() {
        System.out.println("This animal is sleeping.");
    }

    // Static method
    static void breathe() {
        System.out.println("This animal is breathing.");
    }
}

// A class implementing the interface
class Dog1 implements Animal1 {

    @Override

    // Providing implementation for abstract method
    public void makeSound() {
        System.out.println("Bark!");
    }
}



public class allMethodsinterace {
    public static void main(String[] args) {
        // Create an object of Dog (which implements Animal)
        Dog1 dog = new Dog1();

        // Call the implemented method
        dog.makeSound();

        // Call the default method
        dog.sleep();

        // Call the static method from the interface
        Animal1.breathe();
    }
}



