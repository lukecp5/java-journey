package archive;

import java.awt.*;

public class CreateObjectDemo {

    public static void main(String[] args) {

        // Declare and create a point object and two rectangle objects.
        Point originOne = new Point(23, 94);
        Rectangle rectTwo = new Rectangle(50, 100);

        // display rectOne's width, height, and area
        System.out.println("X Position of rectTwo: " + rectTwo.getX());
        System.out.println("Y Position of rectTwo: " + rectTwo.getY());

        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.getX());
        System.out.println("Y Position of rectTwo: " + rectTwo.getY());
    }
}