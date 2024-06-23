package Inheritance;

public class Main {


    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.makeSound();

        Vehicle car = new Car();
        car.drive();

        Shape rectangle = new Rectangle(4, 3);
        System.out.println(rectangle.getArea());


    }

}
