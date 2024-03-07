// A class that takes in the radius of a pizza and calculates the area of the pizza
public class PizzaArea {
    public static void main(String[] args) {
        double radius = 12;
        System.out.println("The area of the pizza is " + printPizzaArea(radius));
    }
    
    public static double printPizzaArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}
