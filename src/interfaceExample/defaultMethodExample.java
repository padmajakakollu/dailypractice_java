package interfaceExample;

interface Animal {

    void sleep();

    default void sound() {
        System.out.println("Animal makes a sound");
    }

    static void run(){
        System.out.println("Animal is running");
    }
}
class Dog implements Animal {
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    // You can override the default method if desired
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }


}

public class defaultMethodExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sleep();
        dog.sound();
        Animal.run();   //static method in interface

    }
}
