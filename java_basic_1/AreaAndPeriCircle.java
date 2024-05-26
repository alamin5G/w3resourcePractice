package java_basic_1;

public class AreaAndPeriCircle {

    //given radius for circle
    public double area(double radius){
        return Math.PI * radius * radius;
    }

    //given radius for perimeter
    public double perimeter(double radius){
        return 2 * Math.PI * radius;
    }

    //
    public static void main(String[] args) {
        AreaAndPeriCircle circle = new AreaAndPeriCircle();

        System.out.println(circle.area(7.5));

        System.out.println(circle.perimeter(7.5));

    }
}
