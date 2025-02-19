package polymorphism;

class Calculator{
    public int add(int a, int b) {
        return a + b;
      //  System.out.println("add : " +(return a + b);
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println( calculator.add(20,40));
        System.out.println( calculator.add(10,20, 30));
        System.out.println( calculator.add(55.00, 55.99));

    }
}
