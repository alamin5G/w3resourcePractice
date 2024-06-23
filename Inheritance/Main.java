package Inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.makeSound();

        Vehicle car = new Car();
        car.drive();

        Shape rectangle = new Rectangle(4, 3);
        System.out.println(rectangle.getArea());



        Employee employee = new HRManager(1, "Alamin", 10000, 8);
        System.out.println(employee.getSalary());
        employee.work();
        HRManager hr = new HRManager(2, "Alamin", 10000, 9);
        System.out.println(hr.getSalary());
        System.out.println(hr.getWorkHours());

    }

}
