public class PrismCalculations {
    public static void main(String[] args) {
        // Test the methods here
    }

    public static double calculateBaseArea(double baseLength, double baseWidth) {
        double area = baseLength * baseWidth;
        return area;
    }

    public static double calculateVol(double baseLength, double baseWidth, double height) {
        double baseArea = calculateBaseArea(baseLength, baseWidth);
        double volume = baseArea * height;
        return volume;
    }
}