public class Driver {
    public static void main(String[] args) {
        int a = 1;
        int b = 12;
        int c = 0;

        while (a < b) {
            a = a + 1;
            b = b - 1;
            c = c + b;
        }

        System.out.print(c);
    }
}