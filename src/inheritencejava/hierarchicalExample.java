package inheritencejava;


class shape {
    public void draw(){
        System.out.println("This is a shape parent class");
    }

}

class Square extends shape{

    @Override
    public void draw(){
        System.out.println("this is square shape");
    }
}
class Rectangle extends shape{

    @Override
    public void draw(){
 System.out.println("this is Rectangle shape");

        }

        public void paint(){
            System.out.println("this is another metho in rectangle");
        }
                }


public class hierarchicalExample {

    public static void main(String[] args) {
        shape square = new Square();
        shape rectangle = new Rectangle();

        square.draw();
        rectangle.draw();

      //  ((Rectangle) rectangle).paint();

        if (rectangle instanceof Rectangle) {
            ((Rectangle) rectangle).paint();

        }

    }


}
