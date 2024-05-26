package java_basic_1;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Formatter;

public class AreaAndPeriRectangle {

    //given width and height for the rectangle
    public double area(double width, double height) {
        return width * height;
    }

    public double perimeter(double width, double height) {
        return 2 * (height + width);
    }




    //main
    public static void main(String[] args) throws FileNotFoundException {

        AreaAndPeriRectangle rectangle = new AreaAndPeriRectangle();
        DecimalFormat df = new DecimalFormat("0.00");

        double area = rectangle.area(5.6, 8.5);
        double perimeter = rectangle.perimeter(5.6, 8.5);
        System.out.println(df.format(area));
        System.out.println(df.format(perimeter));
    }
}
