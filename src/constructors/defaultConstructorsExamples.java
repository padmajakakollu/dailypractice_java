package constructors;

class Car{
    private String brand;
    private int speed;
    private double price;
    private long something;
    private float engineCapacity;

    public void display(){
        System.out.println("Brand:: "+ brand +  "Speed:: "+ speed +" " +  price +" " + something + " "+ engineCapacity);
    }
}

public class defaultConstructorsExamples {
    public static void main(String[] args) {


        Car car = new Car();
        car.display();
    }
}
