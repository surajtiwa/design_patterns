package solid.liskov;


/*
Likov principle states that
we should be able to substitute Base class objects
with child class Objects & this should not alter Behaviour/characterstic of program

if a base class object is subsititued by child class obejct the behavour of code should not be altered
 */

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10,20);//creating a rectangle
        System.out.println(rectangle.computeArea());

      //  Rectangle square=new Square(5);  //if we substitute square object with rectangle object the behaviour of the code changes we get assertion error and the characteristic of a rectangle also changes
        Square square=new Square(5);
        System.out.println(square.computeArea());
        useRectangle(rectangle);
        //use(square);
    }
    private static void useRectangle(Rectangle rectangle) {
        rectangle.setLength(10);
        rectangle.setWidth(20);
       assert rectangle.getLength() == 10:"do not match";
        assert rectangle.getLength() == 20:"do not match";
    }
    /*
    so to make sure the behaviour does not change  we can follow any of the bello steps
    1. do not override the behaviour which is different for both the parent and the child class
    2. make sure to use Interface for implementing different behaviour  in both child and parent class
     */
}
