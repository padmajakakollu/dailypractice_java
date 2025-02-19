package inheritence;

//parent class(Level 1)
class vehicle {
   void drive(){
       System.out.println("vehicle is moving");
   }
}

//Intermediate class Level2
class car extends vehicle{
    void music(){
        System.out.println("vehicle has music system");
    }
}

//Intermediate class Level3
class electriccar extends car{
    void charging(){
        System.out.println("vehicle is Electric car");
    }
}

public class multilevelInheritence {
    public static void main(String[] args) {
        vehicle Electriccar = new electriccar();
        Electriccar.drive();

        if(Electriccar instanceof electriccar) {
            ((electriccar) Electriccar).charging();
            ((electriccar) Electriccar).music();
        }


    }

}
