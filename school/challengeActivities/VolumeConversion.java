public class VolumeConversion {
    public static double convertVolume(int gallons, int pints) {
        double liters = (gallons * 8 + pints) * 0.568261;
        return liters;
    }

    public static void main(String[] args) {
        int gallons = 1;
        int pints = 18;
        double result = convertVolume(gallons, pints);
        System.out.println("Result: " + result + " liters");
    }
}