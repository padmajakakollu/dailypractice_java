package interfaceExample;

interface MyInterface {
    // Static method in an interface
    static void printMessage() {
        System.out.println("This is a static method in an interface.");
    }

    // Regular method (abstract)
    void doSomething();
}

class MyClass implements MyInterface {
    // Implementing abstract method
    @Override
    public void doSomething() {
        System.out.println("Doing something...");
    }
}

class MyClass2 implements MyInterface {
    @Override
    public void doSomething() {
        System.out.println("second class implmentation");
    }
}
    public class staticMethosExample {
        public static void main(String[] args) {
            // Calling the static method of the interface
            MyInterface.printMessage();


            MyClass myClass = new MyClass();
            MyClass2 myclass2 = new MyClass2();
            myClass.doSomething();
            myclass2.doSomething();
        }


    }

